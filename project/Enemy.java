package project;

public class Enemy extends CharacterBase implements EnemyBase {

    Enemy(String name, int health, int manapoints, int damage) {
        super(name, health, manapoints, damage);
    }

    @Override
    public int attack() {
        System.out.println("Enemy punches you! It deals " + getDamage() + " damage!");
        return getDamage();

    }

    @Override
    public int roar() {
        System.out.println("Enemy lets out a fierce roar! It deals " + getDamage() * 3 + " damage!");
        return getDamage() * 3;
    }

    @Override
    void printAttacks() {
        // not needed for enemy
    }
}
