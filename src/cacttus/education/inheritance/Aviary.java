package cacttus.education.inheritance;

import java.util.ArrayList;

public class Aviary {
    private ArrayList<Bird> birds;

    public Aviary() {
        birds = new ArrayList<>();
    }

    public void add(Bird aBird) {
        this.birds.add(aBird);
    }

    public void remove(Bird aBird) {
        this.birds.remove(aBird);
    }

    public int totalBirds() {
        return this.birds.size();
    }

    public void print() {
        for(Bird bird: birds) {
            System.out.println(bird.toString());
        }
    }
}





