package project;

/**
 * CharacterBase
 */
abstract class CharacterBase {
    private int health;
    private int manapoints;
    private int strength;

    abstract void attack();

    public void flee() {
        System.out.println("The player chose to flee!");
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