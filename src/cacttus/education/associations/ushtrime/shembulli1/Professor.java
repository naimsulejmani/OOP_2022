package cacttus.education.associations.ushtrime.shembulli1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Professor {
    private int id;
    private String name;
    private String surname;
    private LocalDate birthdate;
    private String address;
    private String title;
    private Gender gender;

    //One to Many
    private ArrayList<Course> courses;

    public Professor(int id, String name, String surname, LocalDate birthdate, String address, String title, Gender gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.address = address;
        this.title = title;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + birthdate +
                ", address='" + address + '\'' +
                ", title='" + title + '\'' +
                ", gender=" + gender +
                ", courses=" + courses +
                '}';
    }
}

