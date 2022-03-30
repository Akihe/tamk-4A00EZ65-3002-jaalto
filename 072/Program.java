public class Program {
    public static void main(String[] args) {

        Building building = new Cottage(15, 30, 3);
        building.address();

        building = new Apartment(40, 50, 4);
        building.address();
        Cottage cottage = new Cottage(10, 20, 3);
        double area = area(cottage);

        System.out.println(area);
    }

    public static double area(Building building) {
        double result = building.getHeight() * building.getLength() * building.getWidth();
        return result;
    }

}

interface Building {
    public void address();
    public double width = 0;
    public double length = 0;
    public double height = 0;
    public double getHeight();
    public double getLength();
    public double getWidth();

}

class Cottage implements Building {

    private double width;
    private double length;
    private double height;

    Cottage( double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    @Override
    public void address() {
        System.out.println("Cottagetown 123");
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }
}

class Apartment implements Building {
    private double width;
    private double length;
    private double height;

    Apartment( double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    @Override
    public void address() {
        System.out.println("Apartment 1 A 2");
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }

}