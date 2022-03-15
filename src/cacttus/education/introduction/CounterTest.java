package cacttus.education.introduction;

public class CounterTest {
    public static void main(String[] args) {
//        Counter numratoriStudent = new Counter();
//        Counter numratoriDetyrave = new Counter();
//        numratoriStudent.increment();
//        numratoriStudent.increment();
//        numratoriStudent.increment();
//        System.out.println(numratoriStudent.getValue());

        Counter counterOop = new Counter(3);//50
        Counter counterMtm = new Counter(4); //30

        counterOop.increment();
        counterOop.increment();
        counterOop.increment();
        counterOop.increment();

        System.out.println(counterOop.getValue());

        Counter counterBetween = new Counter(100,200);
        counterBetween.increment();
        counterBetween.increment();
        counterBetween.decrement();
        System.out.println(counterBetween.getMaxValue());
        System.out.println(counterBetween.getValue());
    }
}






