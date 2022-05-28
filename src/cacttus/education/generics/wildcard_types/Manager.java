package cacttus.education.generics.wildcard_types;

public class Manager extends Employee {
    private String department;

    public Manager(int id, String name, String surname) {
        super(id, name, surname);
    }

    public Manager(int id, String name, String surname, String department) {
        super(id, name, surname);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
