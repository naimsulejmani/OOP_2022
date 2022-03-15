package cacttus.education.introduction;

public class Date {
    private int day;
    private int month;
    private int year;


    public Date(int day, int month, int year) {
        if (verify(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.printf("Invalid date: %d.%d.%d%n", day, month, year);
        }
    }

    private boolean verify(int day, int month, int year) {
        boolean isInvalidDate = false;
        isInvalidDate = day < 0 || month < 0 || year < 0;
        isInvalidDate = isInvalidDate || day > 31 || month > 12;
        return !isInvalidDate;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 0 || day > 31) return;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 0 || month > 12) return;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void print() {
        System.out.printf("Data eshte: %d.%d.%d%n", day, month, year);
    }
}






