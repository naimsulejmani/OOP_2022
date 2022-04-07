package cacttus.education.associations.ushtrime;

public class AntiAircraftGun {
    private Position position;
    private int damage;
    private Bomber target;

    public AntiAircraftGun(int x, int y) {
        position = new Position(x, y);
        damage = 0;
        target = null;
    }

    public void changePosition(int x, int y) {
        position = new Position(x, y);
    }

    public void moveLeft() {
        position.setX(position.getX() - 1);
    }

    public void moveRight() {
        position.setX(position.getX() + 1);
    }

    public void moveUp() {
        position.setY(position.getY() + 1);
    }

    public void moveDown() {
        position.setY(position.getY() - 1);
    }

    public Position getPosition() {
        return position;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setTarget(Bomber bomber) {
        if (position.distanceTo(bomber.getPosition()) < 10) {
            target = bomber;
        } else {
            System.out.println("It's not in your radar!");
        }
    }

    public void attack() {
        if (target != null) {
            if (Math.random() < 0.5)
                target.setDamage(target.getDamage() + 10);
            else System.out.println("Dolet huq!");
        }
        else {
            System.out.println("Nuk keni target!");
        }
    }
}









