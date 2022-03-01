public class Program {
    public static void main(String[] args) {
        printTable();
    }

    public static void printTable() {
        int size = 9;

        for (int i = -1; i <= size; i++) {
            for (int y = 0; y <= size; y++) {
                if( i == -1 && y == 0) {
                    System.out.printf("%2s%2s", "*", "|");
                } else if (i == -1) {
                    System.out.printf("%3d", y);
                } else if (i == 0) {
                    if (y == 0) {
                        System.out.printf("%4s", "----");
                    } else {
                        System.out.printf("%3s", "---");
                    }
                } else if (y == 0) {
                    System.out.printf("%2d%2s", i, "|");
                } else {
                    System.out.printf("%3d", i*y);
                }
            }
            System.out.printf("%n");
        }
    }
}
