package cacttus.education.inheritance.rock_inheritance;

public class IgenousRock extends Rock {
    public IgenousRock(String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "IgenousRock{description='"
                + getDescription() + "'}";
    }
}
