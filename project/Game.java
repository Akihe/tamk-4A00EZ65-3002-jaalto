package project;

/**
 * Class that holds the Game and any crucial information about it (character info).
 * For further development this would be the place to expand the game with more levels and stuff like upgrading your character.
 */
public class Game {
    /**
     * Holds the players character
     */
    private CharacterBase player;

    /**
     * Holds the players weapon
     */
    private Weapon weapon;

    /**
     * Players name
     */
    private String charName;

    /**
     *  Creates a character and a weapon according to players choices. Calls the welcome method and starts level one.
     *
     * @param charChoice integer of character chosen by the player, used for creating the character
     * @param weaponChoice integer of weapon chosen by the player, used for creating the weapon
     * @param charName Players name
     */
    public Game(int charChoice, int weaponChoice, String charName) {
        createPlayer(charChoice);
        createWeapon(weaponChoice);
        this.charName = charName;
        welcome();
        LevelOne levelOne = new LevelOne(player, weapon);
        LevelTwo levelTwo = new LevelTwo(player, weapon);
    }

    /**
     * Welcomes the player to the game using some information about the choices he made.
     */
    public void welcome() {
        System.out.println(String.format("Welcome to the game %s! " +
                                         "Your choice of weapon seems to be a %s, great choice!%n%s", charName, weapon, weapon.starterWeaponIntro()));
    }

    /**
     * Creates a character object based on the players choice
     * @param choice integer given by player
     */
    public void createPlayer(int choice) {
        switch (choice) {
            case 1:
                player = new Orc(charName, 100, 100, 10);
                break;
            case 2:
                player = new Human(charName, 100, 100, 10);
                break;
        }
    }

    /**
     * Creates a weapon object based on the players choice
     * @param choice integer give by player
     */
    public void createWeapon(int choice) {
        switch (choice) {
            case 1:
                weapon = new Bow();
                break;
            case 2:
                weapon = new Sword();
                break;
        }
    }

}
