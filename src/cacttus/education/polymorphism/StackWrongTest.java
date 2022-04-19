package cacttus.education.polymorphism;

public class StackWrongTest {
    public static void main(String[] args) {
        StackWrong sw = new StackWrong();
        sw.push(100);
        sw.push(20);
        System.out.println(sw.pop());
        sw.add(200); //should not be accessible

        StackCorrect sc = new StackCorrect();
        sc.push(100);
        sc.push(20);
        System.out.println(sc.pop());
       // sc.add(200);
    }
}






