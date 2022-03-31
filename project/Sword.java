package project;

public class Sword extends Weapon {
    String weaponName = "Sword";
    @Override
    String starterWeaponIntro() {
        return "This \"Rusty ol' Stick\" is a really sharp blade, be careful with it!";
    }

    @Override
    public String toString() {
        return weaponName;
    }
}
