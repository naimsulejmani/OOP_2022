package cacttus.education.inheritance.rock_inheritance;

import java.util.Scanner;

public class TestRock {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje lloj guri " +
                "(Bassalt, Chalk, Obsidian, Granit, Marble):");
        String rockString = reader.nextLine();
        Rock selectedRock;

        switch (rockString.toLowerCase()) {
            case "bassalt":
                selectedRock = new Basalt();
                break;
            case "chalk":
                selectedRock = new Chalk();
                break;
            case "obsidian":
                selectedRock = new Obsidian();
                break;
            case "granit":
                selectedRock = new Granit();
                break;
            case "marble":
                selectedRock = new Marble();
                break;
            default:
                selectedRock = new Rock("It is not categorized!");
                break;
        }
        System.out.println(selectedRock);
    }
}
