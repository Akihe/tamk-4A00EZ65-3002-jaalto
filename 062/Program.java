import java.io.Console;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Console input = System.console();
        String name = "";
        List<String> nameList = new ArrayList<>();

        System.out.println("Give first names (stop by typing END): ");

        while (!name.equals("END")) {
            name = input.readLine();
            if (!name.equals("END")) {
                nameList.add(name);
            }
        }

        for (String x : nameList) {
            System.out.println((nameList.indexOf(x) + 1) + " " + x);
        }

        System.out.println("Give a string to search with (type QUIT to end):");
        String search = input.readLine();
        if (search.equals("QUIT")) {
            System.exit(0);
        }

        for (String x : nameList) {
            if (x.toLowerCase().contains(search.toLowerCase())) {
                System.out.println((nameList.indexOf(x) + 1) + " " + x);
            }
        }
    }
}
