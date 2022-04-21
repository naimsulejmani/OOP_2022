package cacttus.education.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) {
        System.out.println(countLines("files/personat.txt"));
    }

    public static int countLines(String fileName) {
        int counter = 0;
        Scanner reader = null;
        try {
            reader = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line;
        while (reader.hasNextLine()) {
            line = reader.nextLine();
            System.out.println(line);
            counter++;
        }
        return counter;
    }
}














