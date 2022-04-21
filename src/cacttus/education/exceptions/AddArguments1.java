package cacttus.education.exceptions;

public class AddArguments1 {
    public static void main(String[] args) {
        args = new String[]{"1", "hasan", "2", "3"}; //po supozoj
        try {
            int sum = 0;
            for (String s : args) {
                sum += Integer.parseInt(s);
            }
            System.out.println("Shuma = " + sum);
        } catch (NumberFormatException ex) {
            System.out.println("Keni vendosur argument jo-numer");
            System.out.println(ex.getMessage());
        }
    }
}





