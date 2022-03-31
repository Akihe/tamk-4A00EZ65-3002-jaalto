package project;

public class Human extends CharacterBase {

    Human(String name, int health, int manapoints, int damage) {
        super(name, health, manapoints, damage);
    }

    @Override
    int attack() {
        return this.getDamage();
    }

    @Override
    public void flee() {
        // TODO Auto-generated method stub

    }
    @Override
    void printAttacks() {
        System.out.println("[1] Attack");
        System.out.println("[2] Flee");
    }
}
