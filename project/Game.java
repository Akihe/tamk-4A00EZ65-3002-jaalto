package project;

public class Game {
    private CharacterBase player;
    private Weapon weapon;
    private String charName;

    public Game(int charChoise, int weaponChoise, String charName) {
        createPlayer(charChoise);
        createWeapon(weaponChoise);
        this.charName = charName;
        welcome();
    }

    public void welcome() {
        System.out.println(String.format("Welcome to the game %s! " +
                                         "Your choise of weapon seems to be a %s, great choise!%n%s", charName, weapon, weapon.starterWeaponIntro()));

    }

    public void createPlayer(int choise) {
        switch (choise) {
            case 1:
                player = new Orc();
                break;
            case 2:
                player = new Human();
                break;
        }
    }

    public void createWeapon(int choise) {
        switch (choise) {
            case 1:
                weapon = new Bow();
                break;
            case 2:
                weapon = new Sword();
                break;
        }
    }

}
