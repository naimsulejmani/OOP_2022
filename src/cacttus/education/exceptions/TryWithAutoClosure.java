package cacttus.education.exceptions;

import java.io.*;

public class TryWithAutoClosure {
    public static void main(String[] args) {
        try (
        BufferedReader reader =
          new BufferedReader(new FileReader("files/personat.txt"));
        PrintWriter writer =
          new PrintWriter(new FileWriter("files/write.txt"))
        ) {
            String text  = reader.readLine();
            System.out.println(text);
            writer.println(text);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}





