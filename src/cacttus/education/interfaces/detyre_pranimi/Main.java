package cacttus.education.interfaces.detyre_pranimi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Score> scores = new ArrayList<>();

        String[] input = sc.nextLine().split(" ");
        Score score = new Score(input[0], Integer.parseInt(input[1]));
        input = sc.nextLine().split(" ");
        Score score1 = new Score(input[0], Integer.parseInt(input[1]));
        scores.add(score);
        scores.add(score1);

        Collections.sort(scores);
        System.out.println(scores);
    }
}
