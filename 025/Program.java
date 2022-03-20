import java.io.Console;

public class Program {
    public static void main(String[] args) {
        Console input = System.console();

        System.out.print("How many objects do you want? : ");
        String askAmount = input.readLine();
        int amount = 0;
        try {
            amount = Integer.parseInt(askAmount);
        } catch (Exception e) {
            System.out.println("Please give an integer, try again.");
            System.exit(1);
        }

        String[] names = new String[amount];
        Coordinate[] coordinates = new Coordinate[amount];
        for (int i = 0; i < amount; i++) {
            System.out.print("Give a name for object " + (i + 1 ) + " : ");
            names[i] = input.readLine();
            System.out.println("Please give the Coordinates of the object (e.g. 12 12 12): ");
            String coords = input.readLine();
            String[] position = coords.split(" ");
            try {
                int[] intCoords =  {Integer.parseInt(position[0]), Integer.parseInt(position[1]), Integer.parseInt(position[2])};
                coordinates[i] = new Coordinate(intCoords[0], intCoords[1], intCoords[2]);
            } catch (Exception e) {
                System.out.println("Invalid input, try again.");
                i--;
                continue;
            }
        }
        printAll(names, coordinates);

    }

    public static void printAll(String[] names, Coordinate[] coordinates) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Location of " + names[i] + " at " + coordinates[i]);
        }
    }
}


class Coordinate {
    private double x;
    private double y;
    private double z;

    Coordinate() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    Coordinate(double x, double y) {
        setX(x);
        setY(y);
        this.z = 0;
    }

    Coordinate(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        if (x > 100) {
            this.x = 100;
        } else if (x < 0) {
            this.x = 0;
        } else this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        if (y > 100) {
            this.y = 100;
        } else if (y < 0) {
            this.y = 0;
        } else this.y = y;
    }
    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }

    public void origo() {
        x = 0;
        y = 0;
        z = 0;
    }

    public void up(double move) {
        double newY = y + move;
        setY(newY);
    }

    public void down(double move) {
        double newY = y - move;
        setY(newY);
    }

    public void left(double move) {
        double newX = x - move;
        setX(newX);
    }

    public void right(double move) {
        double newX = x + move;
        setX(newX);
    }

    @Override
    public String toString() {
        return String.format("X: %.0f" +
                             " Y: %.0f" +
                             " Z: %.0f", x, y, z );
    }
}
