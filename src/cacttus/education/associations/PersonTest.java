package cacttus.education.associations;

import java.util.ArrayList;

public class PersonTest {
    public static void main(String[] args) {
        Person aliZekaj = new Person("Ali Zekaj", 10, 10, 2000);
        System.out.println(aliZekaj.getBirthdate());
        System.out.println(aliZekaj.getBrain());
        System.out.println(aliZekaj.getName());

        System.out.println("--------------------------------------");
        String text = "Naim Sulejmani, 1966, 12, 12;Ali Zekaj,2000,10,10;Muala Kabashi,2004,1,1";

        ArrayList<Person> persons = new ArrayList<>();

        String[] textPersons = text.split(";");

        for (String textPerson : textPersons) {
            String[] attributes = textPerson.split(",");
            String emri = attributes[0].trim();
            int viti = Integer.parseInt(attributes[1].trim());
            int muaji = Integer.parseInt(attributes[2].trim());
            int dita = Integer.parseInt(attributes[3].trim());
            Person person = new Person(emri, dita, muaji, viti);
            System.out.println(person);
            //pe shtoj ne liste
            persons.add(person);
        }

    }
}









