package cacttus.education.generics;

import java.time.LocalDate;

public class BeforeJava5 {
    public static void main(String[] args) {
        Object name = "Naim";
        Object vitet = 100;
        Object data = LocalDate.now();
        int viti = (int) vitet;
        vitet = viti++;

        System.out.println(name);
        System.out.println(vitet);
        System.out.println(data);
    }
}
