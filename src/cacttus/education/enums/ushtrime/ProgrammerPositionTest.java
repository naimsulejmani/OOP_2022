package cacttus.education.enums.ushtrime;

import java.util.Locale;
import java.util.Scanner;

public class ProgrammerPositionTest {
    public static void main(String[] args) {
        //1. Shfaqi te gjitha llojet e pozitave te programerit me rradhe
        for (ProgrammerPosition position : ProgrammerPosition.values()) {
            System.out.println(position);
        }

        ProgrammerPosition erionPosition = ProgrammerPosition.INTERN;
        ProgrammerPosition fatlindaPosition = ProgrammerPosition.JUNIOR;
        ProgrammerPosition profaPosition = ProgrammerPosition.TEAM_LEAD;

        //popullo nje enum nga shfrytezuesi ne menyre dinamike

        Scanner reader = new Scanner(System.in);
        System.out.println("Zgjedh njeren nga pozitat me larte: ");
        String pozita = reader.nextLine().toUpperCase();

        ProgrammerPosition omerPosition = ProgrammerPosition.valueOf(pozita);
        System.out.println(omerPosition);
    }
}







