package cacttus.education.inheritance.rock_inheritance;

import cacttus.education.inheritance.Bird;

import java.util.Scanner;

public class TestRock1 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje lloj guri " +
                "(Bassalt, Chalk, Obsidian, Granit, Marble):");
        String rockString = reader.nextLine();
        Rock selectedRock = (Rock) Class.forName(
                "cacttus.education.inheritance.rock_inheritance."
                        + rockString).newInstance();

        System.out.println(selectedRock);

        if (selectedRock instanceof Basalt) {
            //menyra 1
            ((Basalt) selectedRock).test();

            //menyra 2
            Basalt basalt = (Basalt) selectedRock;
            basalt.test();
        }
    }
}
