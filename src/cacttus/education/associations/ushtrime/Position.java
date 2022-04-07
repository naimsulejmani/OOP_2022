package cacttus.education.associations.ushtrime;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanceTo(Position otherPosition) {
        return Math.sqrt(
                Math.pow(otherPosition.x - x, 2) +
                        Math.pow(otherPosition.y - y, 2)
        );
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
