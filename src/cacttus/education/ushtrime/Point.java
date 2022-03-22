package cacttus.education.ushtrime;

//Point2D
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void checkCuadrat() {
        if (x > 0 && y > 0)
            System.out.println("kjo pike gjendet ne kuadratin e pare");
        else if (x < 0 && y > 0)
            System.out.println("kjo pike gjendet ne kuadratin e dyte");
        else if (x < 0 && y < 0)
            System.out.println("kjo pike gjendet ne kuadratin e trete");
        else if (x > 0 && y < 0)
            System.out.println("kjo pike gjendet ne kuadratin e katert");
        else if (x == 0 && y != 0) {
            System.out.println("kjo pike gjendet ne boshtin y!");
        } else if (x != 0 && y == 0) {
            System.out.println("kjo pike gjendet ne boshtin x!");
        } else
            System.out.println("kjo pike gjendet ne mes!");
    }


    public static double distance(Point a, Point b) {
        return Math.sqrt(
                Math.pow(b.x - a.x, 2) +
                        Math.pow(b.y - a.y, 2)
        );
    }

    public double distanceTo(Point otherPoint) {
        return Math.sqrt(
                Math.pow(x - otherPoint.x, 2) +
                        Math.pow(y - otherPoint.y, 2)
        );
    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}








