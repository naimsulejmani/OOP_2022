package cacttus.education.inheritance.rock_inheritance;

public class Marble extends MetamorphicRock {
    public Marble(String description) {
        super(description);
    }

    public Marble() {
        super("Marble ...");
    }

    @Override
    public String toString() {
        return "Marble{description='" +
                getDescription() + "'}";
    }
}
