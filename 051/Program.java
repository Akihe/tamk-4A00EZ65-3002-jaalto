public class Program {
    public static void main(String[] args) {
        IntegerFixedStack fixed = new IntegerFixedStack(2);
        fixed.push(5);
        fixed.push(10);
        //fixed.push(3); // Throws an error, size goes over the max
        System.out.println("slots in use: " + fixed.used());
        System.out.println("max size: " + fixed.size());
        System.out.println(fixed.pop());
        System.out.println(fixed.pop());
        //System.out.println(fixed.pop()); // Throws an error, no values left to remove
        System.out.println("slots in use: " + fixed.used());

        IntegerDynamicStack dynamic = new IntegerDynamicStack(2);
        dynamic.push(10);
        dynamic.push(20);
        dynamic.push(30); //max size increased from 2 to 12
        System.out.println(dynamic.size());
        System.out.println(dynamic.used());
    }
}

interface Stackable {
    void push(int value);
    int pop();
    int size();
    int used();
}

class IntegerFixedStack implements Stackable {
    private int array[];
    private int currentIndex = 0;

    IntegerFixedStack(int size) {
        if (size > 2) {
            throw new IllegalArgumentException("Max size is 2");
        }
        array = new int[size];
    }

    public void push(int value) {
        try {
            array[currentIndex] = value;
            currentIndex++;
        } catch (Exception e) {
            throw new IllegalArgumentException("Over the size limit");
        }
    }

    public int pop() {
        try {
            int place = currentIndex - 1;
            int value = array[place];
            array[place] = 0;
            currentIndex--;
            return value;
        } catch (Exception e) {
            throw new IllegalArgumentException("No values to be removed");
        }
    }

    //returns max size
    public int size() {
        return array.length;
    }

    //returns how many slots are in use
    public int used() {
        return currentIndex;
    }
}

class IntegerDynamicStack implements Stackable {
    private int[] array;
    private int currentIndex = 0;

    IntegerDynamicStack(int size) {
        if (size > 2) {
            throw new IllegalArgumentException("Max starting size is 2.");
        }
        array = new int[size];
    }

    public void push(int value) {
        if ( currentIndex >= array.length) {
            int[] newArray = new int[array.length + 10];
            System.arraycopy(array, 0, newArray, 0, array.length); //Gets the values from the old array and puts them to the new one.
            array = newArray;
        }
            array[currentIndex] = value;
            currentIndex++;
    }

    public int pop() {
        try {
            int place = currentIndex - 1;
            int value = array[place];
            array[place] = 0;
            currentIndex--;
            return value;
        } catch (Exception e) {
            throw new IllegalArgumentException("No values to be removed");
        }
    }

    public int size() {
        return array.length;
    }

    public int used() {
        return currentIndex;
    }

}