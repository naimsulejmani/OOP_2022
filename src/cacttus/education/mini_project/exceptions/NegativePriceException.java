package cacttus.education.mini_project.exceptions;

public class NegativePriceException extends Exception {
    private double price;

    public NegativePriceException(double price) {
        this.price = price;
    }

    public NegativePriceException(String message, double price) {
        super(message);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
