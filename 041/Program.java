public class Program {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 5);
        System.out.println(rectangle.area());

        Square square = new Square(4);
        System.out.println(square.area());
    }
}

abstract class BaseShape2D {
    public int height;
    public int length;
    public int area() {
        return height * length;
    }
}

class Rectangle extends BaseShape2D {
    Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }
}

class Square extends BaseShape2D {
    Square(int side) {
        this.height = side;
        this.length = side;
    }
}