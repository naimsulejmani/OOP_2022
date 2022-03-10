package cacttus.education.introduction;

public class Dog {
    private String name;
    private float weight;
    private String favoriteToy;

    public Dog(String name, float weight, String favoriteToy) {
        this.name = name;
        this.weight = weight;
        this.favoriteToy = favoriteToy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    public boolean fetch(String toy) {
        return toy.equalsIgnoreCase(favoriteToy);
    }

    public void makeFavourite(String toy) {
        this.favoriteToy = toy;
    }

    public float compare(Dog anotherDog) {
        return this.weight - anotherDog.weight;
    }
}
















