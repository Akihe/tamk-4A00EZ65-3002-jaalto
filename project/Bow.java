package project;

/**
 * Used for creating a new bow for the player
 */
public class Bow extends Weapon{
    /**
     * Weapon names would be stored here, could create multiple different weapons with different name. In current phase no needed.
     */
    private String weaponName = "Bow";

    /**
     * Intro for gaining your first weapon
     */
    @Override
    String starterWeaponIntro() {
        return "Here's your first one, the \"Bow of Many Arrows\" suits you very well for your first journey. Be careful!";
    }

    /**
     * Returns the name of your weapon
     */
    @Override
    public String toString() {
        return weaponName;
    }
}
