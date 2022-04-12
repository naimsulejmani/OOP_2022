package cacttus.education.inheritance.rock_inheritance;

public class Obsidian extends IgenousRock {
    public Obsidian(String description) {
        super(description);
    }

    public Obsidian() {
        super("Obsidian ...");
    }

    @Override
    public String toString() {
        return "Obsidian{description='"
                + getDescription() + "'}";
    }
}
