package cacttus.education.enums;

public class StudentBehaviourTest {
    public static void main(String[] args) {
        StudentBehaviour gresaBehaviour = StudentBehaviour.NOT_LISTENING;
        StudentBehaviour mualaBehaviour = StudentBehaviour.VERY_ACTIVE;

        if (mualaBehaviour.compareTo(gresaBehaviour) > 0) {
            System.out.println("Muala is better than Gresa");
        }
        else if(mualaBehaviour.compareTo(gresaBehaviour)<0) {
            System.out.println("Gresa is better than Muala");
        }
        else {
            System.out.println("They are the same!!! (not exaclty)");
        }

    }
}
