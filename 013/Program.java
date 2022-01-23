import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type weight, ie. 80 (kg)");
        String weightStr = input.nextLine();
        float weight = Integer.parseInt(weightStr);
        System.out.println("Type height, ie. 180 (cm)");
        String heightStr = input.nextLine();
        float height = Integer.parseInt(heightStr);

        float bmi = weight / (height * height / 10000);


        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " cm");
        System.out.println("BMI   : " + bmi);
    }
}
