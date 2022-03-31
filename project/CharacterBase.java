package project;

/**
 * Holds any information that are crucial to player and enemy objects.
 * Could have one more class in the middle "PlayerBase" to separate players and enemies abit.
 */
abstract class CharacterBase {
    /**
     * Health
     */
    private int health;
    /**
     * Mana
     */
    private int manapoints;
    /**
     * Damage dealt by the object
     */
    private int damage;
    /**
     * name
     */
    private String name;

    CharacterBase(String name, int health, int manapoints, int damage) {
        this.name = name;
        this.health = health;
        this.manapoints = manapoints;
        this.damage = damage;
    }

    /**
     * Forced implementation to print all attacks each character has
     */
    abstract void printAttacks();

    /**
     * Force implementation of the basic attac
     * @return damage done
     */
    abstract int attack();

    /**
     * Players move to flee from the enemy, shuts down the game.
     */
    public void flee() {
        System.out.println("The player chose to flee! You didnt die but you have to start over.");
        System.exit(1);
    }

    /**
     * Get players name
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * Set players damage done, for further usage when leveling up.
     * @param damage int new damage to be set
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * Get value of players damage
     * @return int players damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * Set new health value, for example in fights
     * @param health new health value
     */
    public void setHealth(int health) {
        this.health = health;
    }
    /**
     * Get players current health
     * @return health integer
     */
    public int getHealth() {
        return health;
    }
    /**
     * Set players manapoints, used for special casting skills if has any
     * @param manapoints new value of current mana
     */
    public void setManapoints(int manapoints) {
        this.manapoints = manapoints;
    }
    /**
     * Get players current mana
     * @return int players mana
     */
    public int getManapoints() {
        return manapoints;
    }
}