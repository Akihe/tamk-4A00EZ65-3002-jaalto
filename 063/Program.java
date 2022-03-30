import java.util.*;

public class Program {
    public static void main(String[] args) {
        long start;
        long end;

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 100_000; i++) {
            list.add(String.valueOf(i));
        }

        start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        end = System.currentTimeMillis();
        long for_i_loop = end - start;


        start = System.currentTimeMillis();
        for (String x : list) {
            System.out.println(x);
        }
        end = System.currentTimeMillis();
        long for_each = end - start;


        ListIterator<String> it = list.listIterator();
        start = System.currentTimeMillis();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        end = System.currentTimeMillis();
        long iteratorLoop = end - start;

        System.out.println("Simple for loop took " + for_i_loop + "ms");
        System.out.println("For-each loop took " + for_each + "ms");
        System.out.println("Iterator took " + iteratorLoop + "ms");

    }
}

/*
    ROUND 1
Simple for loop took 1743ms
For-each loop took 1726ms
Iterator took 1735ms

    ROUND 2
Simple for loop took 2039ms
For-each loop took 1752ms
Iterator took 1771ms

    ROUND 3
Simple for loop took 1726ms
For-each loop took 1856ms
Iterator took 1790ms

    ROUND 4
Simple for loop took 1748ms
For-each loop took 1731ms
Iterator took 1737ms

    ROUND 5
Simple for loop took 1948ms
For-each loop took 1733ms
Iterator took 1762ms

The test results for me were varying too much to be able to make any good conclusions (i ran alot more tests than just these 5).
The Iterator seems to be most stable choise, simple for-loop being 1,17 times slower at most.

*/
