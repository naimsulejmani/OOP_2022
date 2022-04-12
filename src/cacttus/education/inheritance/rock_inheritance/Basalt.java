package cacttus.education.inheritance.rock_inheritance;

public class Basalt extends IgenousRock {
    public Basalt(String description) {
        super(description);
    }

    public Basalt() {
        super("Bassalt");
    }


    public void test() {
        System.out.println("PO testoj dicka!");
    }

    @Override
    public String toString() {
        return "Basalt{description='"
                + getDescription() + "'}";
    }
}
