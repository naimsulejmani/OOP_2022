package cacttus.education.interfaces;

import java.util.function.DoubleBinaryOperator;

public class TestFutballClub {
    public static void main(String[] args) {
        FutballClub fc = new FutballClub();
        Doable d = new FutballClub();
        Comparable<FutballClub> c = new FutballClub();
        Object o = new FutballClub();

        System.out.println(d instanceof Comparable<?>);
        Comparable<FutballClub> dd = (Comparable<FutballClub>) d;


    }
}






