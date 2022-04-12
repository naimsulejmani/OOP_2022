package cacttus.education.inheritance.rock_inheritance;

public class Chalk extends SedimentaryRock {
    public Chalk(String description) {
        super(description);
    }

    public Chalk() {
        super("Chalk...");
    }

    @Override
    public String toString() {
        return "Chalk{description='"
                + getDescription() + "'}";
    }
}
