package cacttus.education.generics;

public class GenericMethods {
    public static void main(String[] args) {
        String middleName = getMiddle("Naim", "Filan", "Fistek");
        int middleNumber = getMiddle(10, 20, 30, 40, 50);

        System.out.println(middleName);
        System.out.println(middleNumber);

        test("A", "B", 12, 3, 4, 5, 6, 7, 8);
    }

    //varargs - parameter
    public static <T> T getMiddle(T... items) {
        return items[items.length / 2];
    }

    public static void test(String a, String b, int... numrat) {

    }

    public static void test1(int a, int... numrat) {

    }

    public static void test(int... numrat) {

    }
}




