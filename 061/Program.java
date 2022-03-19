public class Program {

    public static void main(String[] args) {
        Numbers<Integer> one = new Numbers<>(new Integer(1));

        one.set(new Integer(3));
        Integer val = one.get();
        System.out.println(val);
    }
}

class Numbers<T> {
    private T number;
    Numbers(T number) {
        this.number = number;
    }

    public void set(T number) {
        this.number = number;
    }

    public T get() {
        return number;
    }
}