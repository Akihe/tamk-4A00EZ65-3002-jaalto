public class Program {
    public static void main(String[] args) {

        Building building = new Cottage();
        building.address();

        building = new Apartment();
        building.address();

    }
}

interface Building {
    public void address();
}

class Cottage implements Building {

    @Override
    public void address() {
        System.out.println("Cottagetown 123");
    }
}

class Apartment implements Building {

    @Override
    public void address() {
        System.out.println("Apartment 1 A 2");
    }
}