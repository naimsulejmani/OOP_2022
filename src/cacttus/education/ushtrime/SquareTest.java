package cacttus.education.ushtrime;

public class SquareTest {
    public static void main(String[] args) {
        Square kat1 = new Square(7);
        Square kat2 = new Square(5);

        System.out.println("Syprina e kat1 = " + kat1.getArea());
        System.out.println("Perimetri i kat1 = " + kat1.getPerimeter());
        System.out.println("Paraqitja grafike e katrorit!");
        kat1.print();

        if(kat1.hasGreaterAreaThan(kat2)) {
            System.out.println("Katrori 1 eshte me i madh se katrori 2");
        }
        else if(kat2.hasGreaterAreaThan(kat1)) {
            System.out.println("Katrori 2 eshte me i madh se katrori 1");
        }
        else {
            System.out.println("Katrore jane te barabarte!");
        }

    }
}
