package cacttus.education.generics.wildcard_types;

public class WildcardUpperBound {
    public static void main(String[] args) {
        Manager m1 = new Manager(1, "Naim", "Sulejmani");
        Manager m2 = new Manager(2, "Mirand", "Rrudhani");

        Pair<Manager> pairOfManager = new Pair<>(m1, m2);
        Pair<? extends Employee> pairOfEmployees = pairOfManager;
        Employee m = pairOfEmployees.getFirst();
        Manager mm = (Manager) pairOfEmployees.getSecond();
        Programmer p1 = new Programmer(3, "filan", "fisteku");
        Pair<? extends  Employee> programmers = new Pair<Programmer>(p1,p1);
        //pairOfEmployees.setSecond(p1);

    }
}
