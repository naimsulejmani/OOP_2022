package cacttus.education.associations.ushtrime.shembulli1;

import java.util.ArrayList;

public class Course {
    private int id;
    private String name;
    private String description;

    //One and only one proffessor
    //Many - to - One
    private Professor professor;
    //One -to - many
    private ArrayList<StudentCourses> students;

    public Course(int id, String name, String description, Professor professor) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.professor = professor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<StudentCourses> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<StudentCourses> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", professor=" + professor +
                ", students=" + students +
                '}';
    }
}
