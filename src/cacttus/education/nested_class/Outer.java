package cacttus.education.nested_class;

public class Outer {
    public static class Inner {
        public int x;
        public int y;
    }

    public void test() {
        PrivateInner pi = new PrivateInner();
        System.out.println(pi.x);
    }

    private static class PrivateInner {
        public int x;
        public int y;
    }
}
