package project;
import java.io.Console;

/**
 *
 */
public class LevelOne {
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
     * Creates an enemy object for the player to fight, starts the fight.
     * @param player player object
     * @param weapon weapon object
     */
    LevelOne(CharacterBase player, Weapon weapon) {
        input = System.console();
        this.player = player;
        enemy = new Enemy("Mouse", 100, 20, 5);
        fight();
    }

    /**
     * Handles the fight in level one. Loops the game as long as player or enemy has above 0 health.
     * Shows the player his possible choices asks for his choice.
     */
    void fight() {
        System.out.println();
        System.out.println("Prepare for your first fight!");
        System.out.println();

        while (enemy.getHealth() > 0 && player.getHealth() > 0) {
            System.out.println("Player's turn, choose your move!");
            player.printAttacks();
            checkChoice();

            if (attackInt == 2) {
                player.flee();  //Shuts the game down if the player chooses to flee.
            }

            int damageDone = player.attack();
            enemy.setHealth(enemy.getHealth() - damageDone);
            if (enemy.getHealth() <= 0) {   //Breaks the loop before the enemies turn if its dead.
                break;
            }
            player.setHealth(player.getHealth() - enemyMove());

            System.out.println(); //print an empty line
            System.out.println("You have " + player.getHealth() + " health left");
            System.out.println("The enemy has " + enemy.getHealth() + " health left");
            System.out.println();
        }
        if (enemy.getHealth() <= 0) {
            System.out.println("You won!");
        } else if (player.getHealth() <= 0) {
            System.out.println("You lost, try again!");
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
     * Uses a random attack move from the enemy.
     * @return the damage of the chosen attack
     */
    int enemyMove() {
        double choice = Math.random();
        if (choice < 0.6) {
                return enemy.attack();
        } else return enemy.roar();
    }
}
