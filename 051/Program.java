public class Program {
    public static void main(String[] args) {
        IntegerFixedStack fixed = new IntegerFixedStack(2);
        System.out.println(fixed.array[0]);
        fixed.pop();
    }
}

interface Stackable {
    void push(int value);
    int pop();
    int size();
    int used();
}

class IntegerFixedStack implements Stackable {
    int array[];

    IntegerFixedStack(int size) {
        if (size > 2) {
            throw new IllegalArgumentException("Max size is 2");
        }
        array = new int[size];
    }

    public void push(int value) {
        try {
        int place = array.length;
        array[place] = value;
        } catch (Exception e) {
            throw new IllegalArgumentException("Over the size limit");
        }
    }

    public int pop() {
        int place = array.length -1;
        int value = array[place];
        array = new int[place-1];
        return value;

    }

    public int size() {
        return array.length;
    }

    public int used() {
        return array[0];
    }
}

class IntegerDynamicStack implements Stackable {
    int array[];
    IntegerDynamicStack(int size) {
        array = new int[size];
    }

    public void push(int value) {

    }

    public int pop() {
        return array[0];

    }

    public int size() {
        return array.length;
    }

    public int used() {
        return array[0];
    }

}