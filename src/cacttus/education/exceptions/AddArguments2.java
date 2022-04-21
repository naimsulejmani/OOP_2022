package cacttus.education.exceptions;

public class AddArguments2 {
    public static void main(String[] args) {
        args = new String[]{"1", "hasan", "2", "3", "filan"}; //po supozoj

        int sum = 0;
        for (String s : args) {
            try {
                sum += Integer.parseInt(s) + 1/0;
            } catch (NumberFormatException ex) {
                System.out.printf("%s it's not a number!%n", s);
            }
            catch (Exception ex) {
                System.out.println("Nje gabim tjeter, qe spo di cfare!");
            }
        }
        System.out.println("Shuma = " + sum);

    }
}
