package cacttus.education.associations.ushtrime.shembulli1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private String surname;
    private LocalDate birthdate;
    private String address;
    private Gender gender;

    private ArrayList<StudentCourses> courses;

    public Student(int id, String name, String surname, LocalDate birthdate, String address, Gender gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.address = address;
        this.gender = gender;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public ArrayList<StudentCourses> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<StudentCourses> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + birthdate +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", courses=" + courses +
                '}';
    }
}
