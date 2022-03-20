import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Coordinate player = new Coordinate(10,10,10);
        Coordinate enemy = new Coordinate(20,20,20);

        Random rand = new Random();

        enemy.setX(rand.nextDouble() * 100);
        enemy.setY(rand.nextDouble() * 100);
        enemy.setZ(rand.nextDouble() * 100);

        System.out.println("Enemys new random position ; ");
        System.out.println("X : " + enemy.getX());
        System.out.println("Y : " + enemy.getY());
        System.out.println("Z : " + enemy.getZ());

        player.setX(rand.nextDouble() * 100);
        player.setY(rand.nextDouble() * 100);
        player.setZ(rand.nextDouble() * 100);

        System.out.println("Players new random position ; ");

        System.out.println("X : " + player.getX());
        System.out.println("Y : " + player.getY());
        System.out.println("Z : " + player.getZ());
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
}
