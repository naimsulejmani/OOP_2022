package cacttus.education;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine().toLowerCase();
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'c' || text.charAt(i) == 'g') count++;
        }

        System.out.println((double) count / text.length());
    }
}
