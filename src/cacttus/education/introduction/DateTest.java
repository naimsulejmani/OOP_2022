package cacttus.education.introduction;

public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date(33, 12, 2022);
        Date d2 = new Date(9, -8, 2022);
        Date d3 = new Date(1, 1, 2023);

        d1.print();
        d2.print();
        d3.print();
    }
}
