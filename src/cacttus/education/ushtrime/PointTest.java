package cacttus.education.ushtrime;

public class PointTest {
    public static void main(String[] args) {
        Point pointA = new Point(3, 2);
        Point pointB = new Point(1, 1);
        Point pointC = new Point(0, 0);
        Point pointD = new Point(-1, 3);

        System.out.println(pointA);
        System.out.println(pointB);
        System.out.println(pointC.toString());
        pointD.checkCuadrat();
        System.out.println(Point.distance(pointA, pointB));
        System.out.println(pointA.distanceTo(pointB));
    }
}







