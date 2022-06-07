package cacttus.education.anonymous_class;

public class Product {
    private String name;
    private String description;
    private double price;
    private float weight;

    public Product() {
    }

    public Product(String name, String description, double price, float weight) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
