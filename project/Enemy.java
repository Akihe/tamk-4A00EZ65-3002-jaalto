package project;

/**
 * An object of which any enemies are created.
 */
public class Enemy extends CharacterBase implements EnemyBase {

    Enemy(String name, int health, int manapoints, int damage) {
        super(name, health, manapoints, damage);
    }

    /**
     * Enemys basic attack
     */
    @Override
    public int attack() {
        System.out.println("Enemy punches you! It deals " + getDamage() + " damage!");
        return getDamage();
    }

    /**
     * Enemys secondary attack
     */
    @Override
    public int roar() {
        System.out.println("Enemy lets out a fierce roar! It deals " + getDamage() * 3 + " damage!");
        return getDamage() * 3;
    }

    /**
     * Not required for the enemy at this point of the game, slightly bad implementation here.
     * Could be used to give information of the enemy to the player
     */
    @Override
    void printAttacks() {
        // not needed for enemy
    }
}
