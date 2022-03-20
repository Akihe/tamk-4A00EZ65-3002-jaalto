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
