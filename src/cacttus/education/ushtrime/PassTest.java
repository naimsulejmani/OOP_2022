package cacttus.education.ushtrime;

public class PassTest {
    public void changePrimitive(int value) {
        value++;
        ++value;
    }

    public void changeReference(MyDate from, MyDate to) {
        from = to;
        from.setDay(-10);
    }

    public void changeObjectDay(MyDate date, int day) {
        date.setDay(day);
    }

    public static void main(String[] args) {
        PassTest pt = new PassTest();
        int numri = 100;
        pt.changePrimitive(numri);
        System.out.println("Numri ka vlere = " + numri);

        MyDate dt1 = new MyDate(22, 3, 2022);
        MyDate dt2 = new MyDate(24, 3, 2022);
        pt.changeReference(dt1, dt2);
        System.out.println(dt1.getDay() + " dhe " + dt2.getDay());

        pt.changeObjectDay(dt2, 30);
        System.out.println(dt2.getDay());
    }


}








