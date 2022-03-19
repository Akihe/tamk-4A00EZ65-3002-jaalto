class Program {
    public static void main(String[] args) {
        Date date = new Date(2015, -1, 20, 12, 0, 0);

        System.out.println("Time is " + date);
    }
}

class Time {
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        try {
            checkHour(hour);
            checkMinute(minute);
            checkSecond(second);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private void checkHour(int hour) throws IllegalHourException {
        if (hour >= 0 && hour <= 24) {
            this.hour = hour;
        } else throw new IllegalHourException("Hours must be between 0-24");
    }

    private void checkMinute(int minute) throws IllegalMinuteException {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else throw new IllegalMinuteException("Minutes must be between 0-59");
    }

    private void checkSecond(int second) throws IllegalSecondException {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else throw new IllegalSecondException("Seconds must be between 0-59");
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
        try {
            this.year = year;
            checkMonth(month);
            this.day = day;
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private void checkMonth(int month) throws IllegalMonthException {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else throw new IllegalMonthException("Month must be between 1-12");
    }

    @Override
    public String toString() {
        return String.format("%d-" +
                             "%02d-" +
                             "%02d ", year, month, day) + super.toString();
    }
}

class IllegalMonthException extends Exception {
    public IllegalMonthException(String message) {
        super(message);
    }
}
class IllegalHourException extends Exception {
    public IllegalHourException(String message) {
        super(message);
    }
}
class IllegalMinuteException extends Exception {
    public IllegalMinuteException(String message) {
        super(message);
    }
}
class IllegalSecondException extends Exception {
    public IllegalSecondException(String message) {
        super(message);
    }
}