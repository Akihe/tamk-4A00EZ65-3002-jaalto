package project;

public class Enemy extends CharacterBase implements EnemyBase {

    Enemy(String name, int health, int manapoints, int damage) {
        super(name, health, manapoints, damage);
    }

    @Override
    int attack() {
        return this.getDamage();

    }

    @Override
    public int roar() {
        return this.getDamage();
    }

    @Override
    void printAttacks() {
        // not needed for enemy
    }
}
