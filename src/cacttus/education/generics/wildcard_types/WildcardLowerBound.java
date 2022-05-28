package cacttus.education.generics.wildcard_types;

public class WildcardLowerBound {
    public static void main(String[] args) {
        Manager m1 = new Manager(1, "Naim", "Sulejmani");
        Manager m2 = new Manager(2, "Mirand", "Rrudhani");

        Pair<Manager> pairOfManager = new Pair<>(m1, m2);
        Pair<? super Manager> managers = pairOfManager;

        managers.setFirst(new Manager(3, "filan", "fisteku"));

        Manager m = (Manager) managers.getFirst();
        Employee mm = (Employee) managers.getFirst();
    }
}
