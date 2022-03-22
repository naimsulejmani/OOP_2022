package cacttus.education.ushtrime;

import java.util.Arrays;

public class PassByValueVsPassByReference {
    public static void main(String[] args) {
        int viti = 2022;
        String profasName = "Naim";
        int[] notat = {10, 9}; //reference

        System.out.println("Before call method");
        System.out.println("viti = " + viti);
        System.out.println("profa name = " + profasName);
        System.out.println("Notat = " + Arrays.toString(notat));
        System.out.println("---------------------------------");
        passByValueExample(viti, profasName);
        passByReferenceExample(notat);
        System.out.println("After call method");
        System.out.println("viti = " + viti);
        System.out.println("profa name = " + profasName);
        System.out.println("Notat = " + Arrays.toString(notat));
    }
    public static void passByValueExample(int viti, String profasName) {
        viti++;
        profasName = "Berat";
    }
    public static void passByReferenceExample(int[] notat) {
        notat[0] = 7;
        notat[1] = 5;
    }


}





