package cacttus.education.abstract_class;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double averageGrade;

    @Override
    public int compareTo(Student o) {
        return (this.averageGrade - o.averageGrade) < 0
                ? -1 : (this.averageGrade - o.averageGrade == 0)
                ? 0 : 1
                ;
    }
}
