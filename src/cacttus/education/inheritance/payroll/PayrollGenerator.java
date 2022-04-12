package cacttus.education.inheritance.payroll;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PayrollGenerator {

    public static void main(String[] args) {
        String textFromFile = "1,Naim,Sulejmani,Programmer,222.31;";
        textFromFile += "2,Albi,Hoti,Consultant,30,50;";
        textFromFile += "3,Gresa,Osmani,Secretary,10,35;";
        textFromFile += "4,Muala,Kabashi,Manager,1250;";

        String[] employeeStrings = textFromFile.split(";");

        //lista e puntoreve te kompanise
        ArrayList<Employee> employees = new ArrayList<>();

        for (String empString : employeeStrings) {
            String[] parts = empString.split(",");
            int id = Integer.parseInt(parts[0].trim());
            String name = parts[1].trim();
            String lastName = parts[2].trim();
            String profession = parts[3].trim();
            double salary = 0;
            int hours = 0;
            float hourlyWage = 0f;
            Employee employee = null;

            if (parts.length == 5) {
                salary = Double.parseDouble(parts[4].trim());
            } else {
                hours = Integer.parseInt(parts[4].trim());
                hourlyWage = Float.parseFloat(parts[5].trim());
            }

            switch (profession.toLowerCase()) {
                case "programmer":
                    employee = new Programmer(id, name, lastName, salary);
                    break;
                case "manager":
                    employee = new Manager(id, name, lastName, salary);
                    break;
                case "secretary":
                    employee = new Secretary(id, name, lastName, hours, hourlyWage);
                    break;
                case "consultant":
                    employee = new Consultant(id, name, lastName, hours, hourlyWage);
                    break;
            }
            if (employee == null) {
                System.out.println("Nuk eshte inicializuar puntori!");
            } else {
                employees.add(employee);
            }
            // System.out.println(employee);


//            System.out.printf("%d - %s %s(%s) with salary %.2f (hours: %d, hourlyWage: %.2f)%n",
//                    id, name, lastName, profession, salary, hours, hourlyWage);
        }
        payAll(employees);
    }

    public static void payAll(ArrayList<Employee> employees) {
        for (Employee emp : employees) {
            new Paycheck(emp, 1, 2022, LocalDate.now()).print();
        }
    }
}








