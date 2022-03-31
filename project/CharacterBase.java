package project;

/**
 * CharacterBase
 */
abstract class CharacterBase {
    private int health;
    private int manapoints;
    private int damage;
    private String name;

    CharacterBase(String name, int health, int manapoints, int damage) {
        this.name = name;
        this.health = health;
        this.manapoints = manapoints;
        this.damage = damage;
    }

    abstract void printAttacks();
    abstract int attack();

    public void flee() {
        System.out.println("The player chose to flee!");
    }


    public String getName() {
        return name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public int getHealth() {
        return health;
    }
    public void setManapoints(int manapoints) {
        this.manapoints = manapoints;
    }
    public int getManapoints() {
        return manapoints;
    }
}