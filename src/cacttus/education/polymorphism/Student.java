package cacttus.education.polymorphism;

public class Student extends Person {
    @Override
    public void test() {
        System.out.println("Profa testet e shtira po i qet!");
    }

    public void profeSpjegoMaMire() {
        System.out.println("Prof spot ngoj se spot kuptoj!");
    }
}
