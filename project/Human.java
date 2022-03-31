package project;

/**
 * One of the possible player characters
 */
public class Human extends CharacterBase {
    /**
     * Sets information by calling the super class constructor
     * @param name players name
     * @param health health amount
     * @param manapoints mana amount
     * @param damage damage the character deals
     */
    Human(String name, int health, int manapoints, int damage) {
        super(name, health, manapoints, damage);
    }

    /**
     * Human basic attack
     */
    @Override
    int attack() {
        System.out.println("You deal " + getDamage() + " damage!");
        return this.getDamage();
    }

    /**
     * Humans all attacks
     */
    @Override
    void printAttacks() {
        System.out.println("[1] Attack");
        System.out.println("[2] Flee");
    }
}
