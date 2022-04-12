package cacttus.education.inheritance.payroll;

import java.util.ArrayList;

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
            if (parts.length == 5) {
                salary = Double.parseDouble(parts[4].trim());
            } else {
                hours = Integer.parseInt(parts[4].trim());
                hourlyWage = Float.parseFloat(parts[5].trim());
            }

            System.out.printf("%d - %s %s(%s) with salary %.2f (hours: %d, hourlyWage: %.2f)%n",
                    id, name, lastName, profession, salary, hours, hourlyWage);
        }
    }
}








