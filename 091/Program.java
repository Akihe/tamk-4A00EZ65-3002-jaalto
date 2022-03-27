import java.util.*;

public class Program {

    interface Comparable {
        boolean check(int a);
    }

    void print(List<Integer> list, Comparable obj) {
        list.forEach(item -> { if (obj.check(item)) System.out.println(item);});
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = -5; i <= 5; i++) {
            list.add(i);
        }

        Comparable negative = (a) -> a < 0;
        Comparable positive = (a) -> a > 0;

        Program app = new Program();

        app.print(list, positive);
        System.out.println();
        app.print(list, negative);
    }
}

