package cacttus.education.generics;

import java.util.Arrays;
import java.util.Collections;

public class TypeVariableBoundExample {
    public static void main(String[] args) {
        Vlersimi[] vlersimet = new Vlersimi[]
                {
                        new Vlersimi("Albin Hetemi", "OOP", 2022, "NS", 99),
                        new Vlersimi("Filan Fisteku", "OOP", 2022, "NS", 87),
                        new Vlersimi("Hajdar dushi", "OOP", 2022, "NS", 90)
                };

        System.out.println(min(vlersimet));

        Borxhliu[] borxhilite = {
                new Borxhliu("Enver", 999),
                new Borxhliu("Drin Hasani", 999),
                new Borxhliu("Muala", -500)
        };
    //    Borxhliu borxhliuIMIre = min(borxhilite);

        Arrays.sort(vlersimet);
    }

    public static <T> T test(T... items) {

        return null;
    }

    public static <T extends Comparable> T min(T[] items) {
        if (items == null) return null;
        T min = items[0];
        for (T item : items) {
            if (item.compareTo(min) < 0) min = item;
        }
        return min;
    }
}









