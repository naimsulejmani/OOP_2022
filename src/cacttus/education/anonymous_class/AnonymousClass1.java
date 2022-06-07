package cacttus.education.anonymous_class;

import java.math.BigDecimal;

public class AnonymousClass1 {
    public static void main(String[] args) {
        double value = 0.10;

        Order order = new Order() {
            public void test() {
                System.out.println("TEST");
            }

            @Override
            public BigDecimal getDiscount() {
                test();
                return BigDecimal.valueOf(0.50 + value);
            }
        };
        System.out.println(order.getDiscount());
    }
}


