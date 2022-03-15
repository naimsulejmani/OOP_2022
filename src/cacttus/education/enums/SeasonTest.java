package cacttus.education.enums;

import java.util.Scanner;

public class SeasonTest {
    public static void main(String[] args) {
        Season vera = Season.SUMMER;
        if (vera == Season.SUMMER) {
            System.out.println("Yeeeehhh skemi uje me pi!");
        }

        if (vera.equals(Season.SUMMER)) {
            System.out.println("lutnu per shi!!!");
        }
        Scanner reader = new Scanner(System.in);
        System.out.println("ZgjEdh njeren nga sezonat: ");
        System.out.println("[SUMMER, WINTER, FALL, SPRING]");
        String season = reader.nextLine().toUpperCase();
        Season sezonaEZgjedhur = Season.valueOf(season);
        System.out.println(sezonaEZgjedhur);

        Season s1 = Season.SUMMER;
        Season s2 = Season.SPRING;

        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));

        for(Season sezone: Season.values()) {
            System.out.println(sezone);
        }
        /*
         new Season[] {SPRING,SUMMER,FALL,WINTER}
         */



    }
}












