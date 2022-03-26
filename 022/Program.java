class Program {
    public static void main(String[] args) {
        Pen pen1 = new Pen();

        Pen pen2 = new Pen();

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

        if (!(obj instanceof Pen)){
            return false;
        }

        Pen compare = (Pen) obj;
        String type1 = type;
        String type2 = compare.type;

        //comparing null would crash the program
        if (type1 == null) type1 = "";
        if (type2 == null) type2 = "";

        if (type1.equals(type2)) {
            return true;
        }
        return false;
    }
}