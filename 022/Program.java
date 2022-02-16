class Program {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.setType("led");

        Pen pen2 = new Pen();
        pen2.setType("led");

        if (pen1.equals(pen2)) {
            System.out.println("pen1 equals pen2");
        }
    }
}

class Pen {
    String type;

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
    }
}