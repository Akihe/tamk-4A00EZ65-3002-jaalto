package project;

import java.io.Console;

public class LevelOne {
    CharacterBase player;
    CharacterBase enemy;
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
            enemy.printAttacks();
            String attackChoise = input.readLine();
            checkChoise(attackChoise);
            if (attackInt == 2) {
                player.flee();
            } int damageDone = player.attack();
            enemy.setHealth(enemy.getHealth() - damageDone);
        }
    }

    void checkChoise(String attackChoise) {
        while(true) {
            try {
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
}
