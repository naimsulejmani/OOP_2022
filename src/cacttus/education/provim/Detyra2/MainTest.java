package cacttus.education.provim.Detyra2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<TrekendeshiKendrejte> trenkendeshat = new ArrayList<>();
        trenkendeshat.add(new TrekendeshiKendrejte(10, 20));
        trenkendeshat.add(new TrekendeshiKendrejte(20, 26));

        Iterator<TrekendeshiKendrejte> iterator = trenkendeshat.iterator();
        while (iterator.hasNext()) {
            TrekendeshiKendrejte tk = iterator.next();
            System.out.println(tk.gethipotenuza());
        }
    }
}
