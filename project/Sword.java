package project;

/**
 * Used for creating a new sword for the player
 */
public class Sword extends Weapon {
    /**
     * Weapon names would be stored here, could create multiple different weapons with different name. In current phase no needed.
     */
    String weaponName = "Sword";

    /**
     * Intro for gaining your first weapon
     */
    @Override
    String starterWeaponIntro() {
        return "This \"Rusty ol' Stick\" is a really sharp blade, be careful with it!";
    }

    /**
     * Returns the name of your weapon
     */
    @Override
    public String toString() {
        return weaponName;
    }
}
