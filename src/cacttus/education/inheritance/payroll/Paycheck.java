package cacttus.education.inheritance.payroll;

import java.time.LocalDate;

public class Paycheck {
    private Employee employee;
    private int month;
    private int year;
    private LocalDate releaseDate;

    public Paycheck(Employee employee, int month, int year, LocalDate releaseDate) {
        this.employee = employee;
        this.month = month;
        this.year = year;
        this.releaseDate = releaseDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void print() {
        System.out.println("--------------------------");
        System.out.println(toString());
        System.out.println("--------------------------");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("");
        result.append(String.format("Paga per periudhen %d/%d%n", month, year));
        result.append(String.format("Puntori: %s %s%n",
                employee.getName(), employee.getLastName()));
        result.append(String.format("Vlera e paguar: %.2f%n", employee.pay()));
        result.append(String.format("Data e leshuar me: %s", releaseDate));

        return result.toString();
    }
}








