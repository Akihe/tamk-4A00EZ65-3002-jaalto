public class Program {

    public static void main(String[] args) {

        int size = 5;

        for (int i = 0; i < size; i++) {
            String result = "";
            for (int y = 0; y < size -1; y++) {
                if (i == size -1) {
                    result += "*";
                } else {
                    result += " ";
                }
            }
            result += "*";
            System.out.println(result);
        }
    }
}
