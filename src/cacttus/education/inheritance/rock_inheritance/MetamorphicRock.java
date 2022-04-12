package cacttus.education.inheritance.rock_inheritance;

public class MetamorphicRock extends Rock {
    public MetamorphicRock(String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "MetamorphicRock{description='"
                + getDescription() + "'}";
    }
}
