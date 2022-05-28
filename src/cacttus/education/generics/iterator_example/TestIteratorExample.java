package cacttus.education.generics.iterator_example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIteratorExample {
    public static void main(String[] args) {
        List<Integer> numrat = new ArrayList<>();
        numrat.add(10);
        numrat.add(20);
        numrat.add(30);

        Iterator<Integer> iterator = numrat.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
