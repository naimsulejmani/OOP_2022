package cacttus.education.anonymous_class;

import java.math.BigDecimal;

public class OnlineOrder extends Order {
    @Override
    public BigDecimal getDiscount() {
        return BigDecimal.valueOf(0.10);
    }
}
