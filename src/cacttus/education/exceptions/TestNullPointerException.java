package cacttus.education.exceptions;

import java.util.Scanner;

public class TestNullPointerException {
    public static void main(String[] args) {
        Scanner reader = null;
        int numri = reader.nextInt();
        System.out.println(numri);
    }
}
