package project;

public class Orc extends CharacterBase {

    Orc(String name, int health, int manapoints, int damage) {
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
        // TODO Auto-generated method stub

    }
}
