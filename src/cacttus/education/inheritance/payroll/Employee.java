package cacttus.education.inheritance.payroll;

public class Employee {
    private int id;
    private String name;
    private String lastName;
    //private double pay;

    public Employee(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double pay() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%d,%s,%s", id, name, lastName);
    }
}




