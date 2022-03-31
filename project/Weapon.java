package project;

/**
 * Base class for all weapons, holds any crucial data used by each one of them.
 */
abstract class Weapon {

    /**
     * basic damage of the weapon, not used in games current phase but would be if expanded.
     */
    private int damage;
    /**
     * Each started weapon has an intro that the player sees when they get their first chosen weapon
     * @return an intro string
     */
    abstract String starterWeaponIntro();

    /**
     * Sets the weapons damage value
     * @param damage new damage to be set, integer
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }
    /**
     * Returns weapon damage
     * @return weapon damage int
     */
    public int getDamage() {
        return damage;
    }

}
