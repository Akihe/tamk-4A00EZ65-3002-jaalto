public class Program {
    public static void main(String[] args) {
        int[] array = {3, 8, 15, 19, 23};

        int result = searchArray(array, 15);
        System.out.println(result);
    }

    static int searchArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}