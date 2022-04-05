package cacttus.education.associations;

public class Course {
    private final int id;
    private String name;
    private final int MAX_STUDENTS = 100;
    private Student[] enrolledStudents;
    private int counter = 0;

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
        enrolledStudents = new Student[MAX_STUDENTS];
    }

    public void enrollStudent(Student student) {
        if (counter < MAX_STUDENTS) {
            enrolledStudents[counter++] = student;
        } else {
            System.out.println("SKa vende te lira per regjistrim!");
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMAX_STUDENTS() {
        return MAX_STUDENTS;
    }

    public int getCounter() {
        return counter;
    }

    public void printDetails() {
        System.out.printf("Course name: %s (%d)%n", name, id);
        System.out.printf("Enrolled Students: %d%n", counter);
        System.out.printf("Free seats: %d%n", MAX_STUDENTS - counter);
        System.out.println("Lista e studenteve te regjistuar:");
        System.out.println("---------------------------------");
        for (Student student : enrolledStudents) {
         //   if (student == null) break;
            if (student != null)
                System.out.println(student);
        }
        System.out.println("----------------------------------");
    }
}







