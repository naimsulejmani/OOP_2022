package cacttus.education.associations.ushtrime.shembulli1;

import java.time.LocalDate;

public class StudentCourses {
    private int studentId;
    private int courseId;
    private Student student;
    private Course course;
    private LocalDate registrationDate;

    public StudentCourses(int studentId, int courseId, Student student, Course course, LocalDate registrationDate) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.student = student;
        this.course = course;
        this.registrationDate = registrationDate;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "StudentCourses{" +
                "studentId=" + studentId +
                ", courseId=" + courseId +
                ", student=" + student +
                ", course=" + course +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
