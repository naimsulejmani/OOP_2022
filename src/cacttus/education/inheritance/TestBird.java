package cacttus.education.inheritance;

public class TestBird {
    public static void main(String[] args) {
        Bird aBird = new Bird("koko", "brown", "kikirika", "walking");
        Goose aGoose = new Goose("quack", "white", "leblebija");

        Aviary naimisAviary = new Aviary();

        System.out.println(aBird.getCall());
        System.out.println(aGoose.getCall());

        naimisAviary.add(aBird);
        naimisAviary.add(aGoose);

        System.out.println(naimisAviary.totalBirds());

        naimisAviary.print();

        naimisAviary.remove(aBird);
        System.out.println(naimisAviary.totalBirds());

        Bird test = new Goose("a", "b", "c");
        //Goose goose = new Bird("a","b","c","d");

    }
}








