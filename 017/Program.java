import java.lang.Math;

public class Program {
    public static void main(String[] args) {
        String[] fruits = {"banana", "lemon", "apple", "cherry", "blueberry", "watermelon", "bar"};

        String one = fruits[getRandom()];
        String two = fruits[getRandom()];
        String three = fruits[getRandom()];

        System.out.println(one + " " + two + " " + three);
        System.out.println(winCheck(one, two, three));
    }

    public static int getRandom() {
        int random = (int)(Math.random() * 7);
        return random;
    }

    public static String winCheck(String one, String two, String three) {
        if (one.equals(two) && one.equals(three)) {
            return "CONGRATULATIONS, YOU WON !!";
        } else return "Sorry, no win this time";
    }
}