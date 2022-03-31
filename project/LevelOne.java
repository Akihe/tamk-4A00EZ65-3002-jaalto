package project;

import java.io.Console;

public class LevelOne {
    CharacterBase player;
    Enemy enemy;
    Console input;
    int attackInt;

    LevelOne(CharacterBase player, Weapon weapon) {
        input = System.console();
        this.player = player;
        enemy = new Enemy("Mouse", 100, 20, 5);
        fight();
    }

    void fight() {
        while (enemy.getHealth() > 0 && player.getHealth() > 0) {
            System.out.println("Player's turn, choose your move!");
            player.printAttacks();
            checkChoice();

            if (attackInt == 2) {
                player.flee();
            }

            int damageDone = player.attack();
            enemy.setHealth(enemy.getHealth() - damageDone);
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

    void checkChoice() {
        while(true) {
            try {
                String attackChoise = input.readLine();
                attackInt = Integer.parseInt(attackChoise);
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

    int enemyMove() {
        double choise = Math.random();
        if (choise < 0.6) {
                return enemy.attack();
        } else return enemy.roar();
    }
}
