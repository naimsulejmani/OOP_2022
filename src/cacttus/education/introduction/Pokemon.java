package cacttus.education.introduction;

public class Pokemon {
    //fushat -> variablat instance
    String name;
    String type;
    int health;

    //metodat
    public boolean dodge() {
        return Math.random() > 0.5;
    }

    public void attack(Pokemon enemy) {
        if (!enemy.dodge()) {
            enemy.health--;
        }
    }
}







