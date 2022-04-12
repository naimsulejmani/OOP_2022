package cacttus.education.inheritance.payroll;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(int id, String name, String lastName, double salary) {
        super(id, name, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double pay() {
        return getSalary();
    }
}


