package project;
import java.io.Console;
import java.util.*;

/**
 * LevelTwo has the second fight for the player
 */
public class LevelTwo {
    /**
     * Holds the players object
     */
    CharacterBase player;

    /**
     * Holds the enemy object
     */
    Enemy enemy;

    /**
     * For players input
     */
    Console input;

    /**
     * Players choice of attack as an integer
     */
    int attackInt;

    /**
     * Holds every enemy used in this level.
     */
    List<Enemy> enemyList;

    /**
     * Heals the player, creates multiple enemies for the player to fight and starts the fight.
     * @param player player object
     * @param weapon weapon object
     */
    LevelTwo(CharacterBase player, Weapon weapon) {
        input = System.console();
        this.player = player;
        System.out.println();
        System.out.println("Welcome to level two, your character has been healed.");
        System.out.println();
        player.setHealth(150);
        player.setDamage(20);
        enemyList = new ArrayList<>();
        createEnemies();
        fight();
    }

    /**
     * Creates multiple enemies for level two and puts them in a list.
     */
    void createEnemies() {
        enemyList.add(new Enemy("Bat", 40, 100, 5));
        enemyList.add(new Enemy("Snake", 40, 100, 10));
        enemyList.add(new Enemy("Bee", 40, 100, 5));
    }

    /**
     * Handles the fight in level two. Loops the game as long as player or the enemies in total have above 0 health.
     * Shows the player his possible choices and asks for his choice.
     */
    void fight() {
        System.out.println();
        System.out.println("This time your fighting multiple enemies!");
        System.out.println();

        while (getEnemiesTotalHealth() > 0 && player.getHealth() > 0) {
            System.out.println("Player's turn, choose your move!");
            player.printAttacks();
            checkChoice();
            System.out.println();

            if (attackInt == 2) {
                player.flee();  //Shuts the game down if the player chooses to flee.
            }

            int damageDone = player.attack();
            reduceEnemyHealth(damageDone);
            if (getEnemiesTotalHealth() <= 0) {   //Breaks the loop before the enemies turn if theyre all dead.
                break;
            }

            // Plays a move for each living enemy, stores the total damage done to a variable.
            int totalDamageByEnemy = enemyList.stream().mapToInt((enemy) -> {
               chooseAttack<Enemy> holder = new chooseAttack<>(enemy);
               if (holder.enemy.getHealth() > 0) {
                return holder.enemyMove();
               } else return 0;
            }).sum();

            player.setHealth(player.getHealth() - totalDamageByEnemy);

            System.out.println(); //print an empty line
            System.out.println("You have " + player.getHealth() + " health left");
            System.out.println("The enemies in total have " + getEnemiesTotalHealth() + " health left");
            System.out.println();
        }
        if (getEnemiesTotalHealth() <= 0) {
            System.out.println("You won!");
        } else if (player.getHealth() <= 0) {
            System.out.println("You lost, try again!");
        }
    }

    /**
     * Gets the total health of each enemy in this level.
     * @return integer sum of all enemies health
     */
    int getEnemiesTotalHealth() {
        return enemyList.stream().mapToInt(enemy -> enemy.getHealth()).sum();
    }

    /**
     * Reduces the health of the enemies in order from first to last. Poor implementation but it'll do.
     * @param damagedone damage done by the player
     */
    void reduceEnemyHealth(int damagedone) {
        if (enemyList.get(0).getHealth() > 0) {
            enemyList.get(0).setHealth(enemyList.get(0).getHealth() - damagedone); //hit the first enemy if it has hp left
        } else if (enemyList.get(1).getHealth() > 0) {
            enemyList.get(1).setHealth(enemyList.get(1).getHealth() - damagedone); //hit the second enemy after first one dies
        } else if (enemyList.get(2).getHealth() > 0) {
            enemyList.get(2).setHealth(enemyList.get(2).getHealth() - damagedone); //hit the third enemy after 2nd one is dead
        }
     }

    /**
     * Checks wether players chosen input is valid. If not, asks again.
     */
    void checkChoice() {
        while(true) {
            try {
                String attackChoice = input.readLine();
                attackInt = Integer.parseInt(attackChoice);
                if (attackInt > 2 || attackInt < 1) {
                    System.out.println("Wrong input, please type 1 or 2");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Wrong input, please type 1 or 2");
                continue;
            }
        }
    }

    /**
     * Inner class used for choosing an attack for each created enemy.
     */
    class chooseAttack<T extends Enemy> {
        T enemy;
        chooseAttack(T enemy) {
            this.enemy = enemy;
        }

        /**
         * Uses a random attack move from the enemy.
         * @return the damage of the chosen attack
         */
        int enemyMove() {
            double choice = Math.random();
            if (choice < 0.6) {
                    return this.enemy.attack();
            } else return this.enemy.roar();
        }
    }
}
