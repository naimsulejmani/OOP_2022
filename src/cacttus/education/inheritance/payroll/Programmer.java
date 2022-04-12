package cacttus.education.inheritance.payroll;

public class Programmer extends SalariedEmployee {
    public Programmer(int id, String name, String lastName, double salary) {
        super(id, name, lastName, salary);
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%.2f;",
                super.toString(), "Programmer", getSalary());
    }
}
