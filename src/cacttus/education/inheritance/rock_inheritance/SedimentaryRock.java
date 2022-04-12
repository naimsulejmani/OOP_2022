package cacttus.education.inheritance.rock_inheritance;

public class SedimentaryRock extends Rock {
    public SedimentaryRock(String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "SedimentaryRock{description='"
                + getDescription() + "'}";
    }
}
