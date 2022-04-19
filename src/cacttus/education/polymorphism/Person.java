package cacttus.education.polymorphism;

public class Person {
    private PersonType personType;

    public void test() {
        System.out.println("It's a test!");
    }

    public PersonType getPersonType() {
        return personType;
    }

    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }
}
