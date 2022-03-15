package cacttus.education.enums;

import java.util.Scanner;

public class DayOfWeekTest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int index = 0;
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            System.out.printf("%d - %s%n", index++, dayOfWeek);
        }
        int whichSeason = reader.nextInt();
        DayOfWeek selectedSeason = DayOfWeek.values()[whichSeason];
        tellItLikeItIs(selectedSeason);
    }

    public static void tellItLikeItIs(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY:
                System.out.println("Mondays are bad");
                break;
            case FRIDAY:
                System.out.println("Fridays are better!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's a weekend!");
                break;
            default:
                System.out.println("CKA ME THAN!");
                break;
        }
    }
}

