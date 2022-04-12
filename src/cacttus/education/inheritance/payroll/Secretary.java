package cacttus.education.inheritance.payroll;

public class Secretary extends HourlyEmployee {
    public Secretary(int id, String name, String lastName, int hours, float hourlyWage) {
        super(id, name, lastName, hours, hourlyWage);
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%d,%.2f;",
                super.toString(), "Secretary", getHours(), getHourlyWage());
    }
}
