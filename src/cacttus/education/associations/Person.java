package cacttus.education.associations;

import java.time.LocalDate;

public class Person {
    private Brain brain; //null
    private String name; //null
    private LocalDate birthdate;//null

    public Person(String name, int day, int month, int year) {
        this.name = name;
        birthdate = LocalDate.of(year, month, day);
        brain = new Brain();//truri i gjenise
    }

    public Brain getBrain() {
        return brain;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "brain=" + brain +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
