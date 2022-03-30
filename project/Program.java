package project;
import java.io.Console;

public class Program {
    public static void main(String[] args) {
        Console input = System.console();
        System.out.println("Choose your character");
        String charChoise = input.readLine();
        Human player = new Human();
        player.setHealth(100);
        player.getHealth();
    }
}

