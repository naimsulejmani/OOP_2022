package cacttus.education.ushtrime;

public class Square {
    private double a; //brinja

    public Square(double a) {
        setA(a);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a > 0)
            this.a = a;
        else
            System.out.println("Nuk mundet te krijohet ky katrore");
    }

    //gjej syprinen
    public double getArea() {
        return a * a;
    }

    public double getPerimeter() {
        return 4 * a;
    }

    public void print() {
        System.out.println(" ------");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println(" ------");
    }

    public boolean hasGreaterAreaThan(Square otherSquare) {
        return a > otherSquare.a;
    }


}











