package cacttus.education.polymorphism;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setPersonType(PersonType.PROFESSOR);

        p.test();
    }
}
