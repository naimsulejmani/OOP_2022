package cacttus.education.associations;

public class CourseStudentTest {
    public static void main(String[] args) {
        Course oop = new Course(1, "Object Oriented programming");
        Course dsa = new Course(2, "Data Structures and Algorithms");

        Student s1 = new Student(1, "Omer", "Shaqiri");
        Student s2 = new Student(2, "Filan", "Fisteku");
        Student s3 = new Student(3, "Shaip", "Syla");

        oop.enrollStudent(s1);
        oop.enrollStudent(s2);
        oop.enrollStudent(s3);

        dsa.enrollStudent(s3);

        oop.printDetails();
        System.out.println();
        dsa.printDetails();
    }
}
