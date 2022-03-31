package project;

public class Orc extends CharacterBase {

    Orc(String name, int health, int manapoints, int damage) {
        super(name, health, manapoints, damage);
    }

    @Override
    int attack() {
        System.out.println("You deal " + getDamage() + " damage!");
        return this.getDamage();

    }

    @Override
    void printAttacks() {
        System.out.println("[1] Attack");
        System.out.println("[2] Flee");
    }
}
