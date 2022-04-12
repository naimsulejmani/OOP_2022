package cacttus.education.inheritance.payroll;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "naim", "sulejmani");
        Employee manager = new Manager(2, "Filan", "fisteku", 233);
        Employee consultant = new Consultant(3, "A", "B", 10, 10);

        System.out.println(employee.pay());
        System.out.println(manager.pay());
        System.out.println(consultant.pay());
    }
}
