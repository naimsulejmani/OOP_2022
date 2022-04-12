package cacttus.education.inheritance.payroll;

public class HourlyEmployee extends Employee {
    private int hours;
    private float hourlyWage;

    public HourlyEmployee(int id, String name, String lastName, int hours, float hourlyWage) {
        super(id, name, lastName);
        this.hours = hours;
        this.hourlyWage = hourlyWage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public float getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(float hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double pay() {
        return hours * hourlyWage;
    }
}
