package cacttus.education.polymorphism;

public class DowncastingTest {
    public static void main(String[] args) {
        Person p = new Professor();
        Person s = new Student();

        p.test();
        s.test();
        //down-casting
        if (p instanceof Student) {
            Student ps = (Student) p;
            System.out.println("It's a studenti");
            ps.profeSpjegoMaMire();
        }
        else if(p instanceof  Professor) {
            Professor pp = (Professor) p;
            System.out.println("It's a professori");
            pp.intMosBoZhurem();
        }
    }
}





