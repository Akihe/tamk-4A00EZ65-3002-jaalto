import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Coordinate player = new Coordinate(10,10,10);
        Coordinate enemy = new Coordinate(20,20,20);

        Random rand = new Random();

        player.setX(rand.nextDouble() * 100);
        player.setY(rand.nextDouble() * 100);
        player.setZ(rand.nextDouble() * 100);

        System.out.println(player);

        player.down(5);
        player.right(10);
        player.left(2);
        player.up(2);

        System.out.println(player);
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
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    Coordinate(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
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
        y = y + move;
        if (y > 100) {
            y = 100;
        }
    }

    public void down(double move) {
        y = y - move;
        if (y < 0) {
            y = 0;
        }
    }

    public void left(double move) {
        x = x - move;
        if (x < 0) {
            x = 0;
        }
    }

    public void right(double move) {
        x = x + move;
        if (x > 100) {
            x = 100;
        }
    }

    @Override
    public String toString() {
        return String.format("X: %f%n" +
                             "Y: %f%n" +
                             "Z: %f", x, y, z );
    }
}