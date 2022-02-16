class Program {
    public static void main(String[] args) {
        Date date = new Date(2015, 1, 20, 12, 0, 0);

        System.out.println("Time is " + date);
    }
}

class Time {
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:" +
                             "%02d:" +
                             "%02d", hour, minute, second);
    }
}

class Date extends Time {
    private int year;
    private int month;
    private int day;

    Date(int year, int month, int day, int hour, int minute, int second) {
        super(hour, minute, second);
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return String.format("%d-" +
                             "%02d-" +
                             "%02d ", year, month, day) + super.toString();
    }
}