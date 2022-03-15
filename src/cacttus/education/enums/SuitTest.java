package cacttus.education.enums;

public class SuitTest {
    public static void main(String[] args) {
        int s = 1; //1 per SPIDER ( detelin)
        drawSuitOnCard(s);
        drawSuitOnCard(-10);
        Suit suit = Suit.DIAMONDS;
        drawSuitOnCard(suit);
        drawSuitOnCard(Suit.SPADES);

    }
    public static void drawSuitOnCard(int suit) {
        System.out.println("Ju keni zgjedhur: "+suit);
    }

    public static void drawSuitOnCard(Suit suit) {
        System.out.println("Ju keni zgjedhur: "+suit);
    }
}







