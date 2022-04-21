package cacttus.education.exceptions;

import java.math.BigDecimal;

public class NegativePriceProductException extends ProductException {
    private BigDecimal negativePrice;

    public NegativePriceProductException(BigDecimal negativePrice) {
        this.negativePrice = negativePrice;
    }

    public NegativePriceProductException(String message, BigDecimal negativePrice) {
        super(message);
        this.negativePrice = negativePrice;
    }

    public BigDecimal getNegativePrice() {
        return negativePrice;
    }
}
