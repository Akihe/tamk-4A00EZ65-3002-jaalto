package project;
import java.io.Console;

/**
 * @author Aki Helin aki.helin@tuni.fi
 * @version 1.0
 *
 * A small game created in purpose of practicing java.
 */
public class Program {
    /**
     * Used for taking players input
     */
    private static Console input;
    /**
     * Players character of choise as an integer
     */
    private static int charChoiseInt;
    /**
     * Players weapon of choise as an integer
     */
    private static int weaponChoiseInt;
    /**
     * Players name
     */
    private static String charName;

    /**
     * Total amount of weapons available for the player
     */
    private static int totalWeapons = 2;

    /**
     * Total amount of characters available for the user
     */
    private static int totalCharacters = 2;
    public static void main(String[] args) {
        input = System.console();
        askChoises();
        Game game = new Game(charChoiseInt, weaponChoiseInt, charName);
    }
    /**
     * Asks the player which character they want to play and which weapon they want to use.
     * If an error occurs here, catch it and close the game.
     */
    public static void askChoises() {
        try {
            System.out.println("Choose your character");
            System.out.println(String.format("[%d]%s%n" +
                                            "[%d]%s", 1, " Orc", 2, " Human"));

            String charChoise = input.readLine();
            charChoiseInt = integerCheck(charChoise);

            if (charChoiseInt > totalCharacters || charChoiseInt < 1) { //Throwing an error if the choise is a number but doesnt fit the range
                throw new FalseInputException("Number out of range, please restart the game and try again");
            }

            System.out.println("Choose your weapon");
            System.out.println(String.format("[%d]%s%n" +
                                            "[%d]%s", 1, " Bow", 2, " Sword"));

            String weaponChoise = input.readLine();
            weaponChoiseInt = integerCheck(weaponChoise);

            if (weaponChoiseInt > totalWeapons || weaponChoiseInt < 1) { //Throwing an error if the choise is a number but doesnt fit the range
                throw new FalseInputException("Number out of range, please restart the game and try again");
            }
        } catch (Exception e) {
            System.err.println(e);
            System.exit(1);
        }

        System.out.print("Give your character a name: ");
        charName = input.readLine();
        System.out.println();
    }

    /**
     * Used for checking wether the used gave a valid input,
     * @param choise players input, String which will be parsed to an integer
     * @return parsed integer
     * @throws FalseInputException Custom exception thrown if parsing the integer fails.
     */
    public static int integerCheck(String choise) throws FalseInputException {
        try {
            return Integer.parseInt(choise);
        } catch (Exception e) {
            throw new FalseInputException("Needs to be an integer, please restart the game and try again.");
        }
    }
}

