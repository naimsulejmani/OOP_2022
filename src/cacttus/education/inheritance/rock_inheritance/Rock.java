package cacttus.education.inheritance.rock_inheritance;

public class Rock {
    private String description;

    public Rock(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Rock{" +
                "description='" + description + '\'' +
                '}';
    }
}
