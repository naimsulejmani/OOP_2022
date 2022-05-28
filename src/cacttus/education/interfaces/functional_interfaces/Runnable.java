package cacttus.education.interfaces.functional_interfaces;
//Java DATA ANNOTATIONS
//SOLID Principle

//@Override -> i kena tregu kompjallerit se jemi duke mbishkru metoden
//@FunctionalInterface - i tregon kompjallerit se ky interface duhet me pas vetem nje metode
@FunctionalInterface
public interface Runnable {
    void run();
    //void test(); // vetem nje metode abstracte mundet me pas metoda tjera default, private dhe static
}
