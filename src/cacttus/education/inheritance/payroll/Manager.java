package cacttus.education.inheritance.payroll;

public class Manager extends SalariedEmployee {
    public Manager(int id, String name, String lastName, double salary) {
        super(id, name, lastName, salary);
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%.2f;",
                super.toString(), "Manager", getSalary());
    }
}
