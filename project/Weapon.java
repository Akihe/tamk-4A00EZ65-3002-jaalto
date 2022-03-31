package project;

abstract class Weapon {
    private int damage;
    abstract String starterWeaponIntro();

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getDamage() {
        return damage;
    }

}
