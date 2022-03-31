package project;
import java.io.Console;

public class Program {
    private static Console input;
    private static int charChoiseInt;
    private static int weaponChoiseInt;
    private static String charName;
    public static void main(String[] args) {
        input = System.console();

        askChoises();
        Game game = new Game(charChoiseInt, weaponChoiseInt, charName);
    }

    public static void askChoises() {
        try {
            System.out.println("Choose your character");
            System.out.println(String.format("[%d]%s%n" +
                                            "[%d]%s", 1, " Orc", 2, " Human"));

            String charChoise = input.readLine();
            charChoiseInt = integerCheck(charChoise);

            System.out.println("Choose your weapon");
            System.out.println(String.format("[%d]%s%n" +
                                            "[%d]%s", 1, " Bow", 2, " Sword"));

            String weaponChoise = input.readLine();

            weaponChoiseInt = integerCheck(weaponChoise);
        } catch (Exception e) {
            System.err.println(e);
            System.exit(1);
        }


        System.out.print("Give your character a name: ");
        charName = input.readLine();
        System.out.println();
    }

    public static int integerCheck(String choise) throws FalseInputException {
        try {
            return Integer.parseInt(choise);
        } catch (Exception e) {
            throw new FalseInputException("Needs to be an integer, please restart the game and try again.");
        }

    }
}

