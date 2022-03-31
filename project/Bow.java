package project;

public class Bow extends Weapon{
    private String weaponName = "Bow";

    @Override
    String starterWeaponIntro() {
        return "Here's your first one, the \"Bow of Many Arrows\" suits you very well for your first journey. Be careful!";
    }

    @Override
    public String toString() {
        return weaponName;
    }
}
