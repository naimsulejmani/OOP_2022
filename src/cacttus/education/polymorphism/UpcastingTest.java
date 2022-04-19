package cacttus.education.polymorphism;

public class UpcastingTest {
    public static void main(String[] args) {
        Person s = new Student();
        Person p = new Professor();
        Person c = (Student) new Student();
    }
}
