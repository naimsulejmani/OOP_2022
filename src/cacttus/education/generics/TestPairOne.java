package cacttus.education.generics;

public class TestPairOne {
    public static void main(String[] args) {
        PairOne p1 = new PairOne(100, 200);
        int first = (int) p1.getFirst();

        PairOne<Integer> p2 = new PairOne<>(20, 30);
        first = p2.getFirst();
        int second = p2.getSecond();

        Pair<String, Integer>
                studenti1 = new Pair<>("Naim", 100);
        Pair<String, Double> paga1 = new Pair<>("Diellza Morina", 3333.33);
        Pair<Integer, Integer> p = new Pair<>(200, 300);
    }
}








