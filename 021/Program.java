class Program {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.setType("led");

        System.out.println(pen);
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
}