package cacttus.education.polymorphism;

public class Stack {
    private final int MAX_SIZE;
    public static final int REAL_FITON;

    static {
        REAL_FITON = 1;
    }
    //ose brenda initializer block
//    {
//        MAX_SIZE = 10;
//    }

    //ose brenda konstruktorit
    public Stack(int max_size) {
        MAX_SIZE = max_size;
    }
}
