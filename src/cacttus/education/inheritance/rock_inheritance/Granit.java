package cacttus.education.inheritance.rock_inheritance;

public class Granit extends IgenousRock {
    public Granit(String description) {
        super(description);
    }

    public Granit() {
        super("Granit ...");
    }

    @Override
    public String toString() {
        return "Granit{description='"
                + getDescription() + "'}";
    }
}
