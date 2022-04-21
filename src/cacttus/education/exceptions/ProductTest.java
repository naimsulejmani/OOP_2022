package cacttus.education.exceptions;

import cacttus.education.polymorphism.Professor;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductTest {
    public static void main(String[] args) {
        try {
            Product cdEMedes = new Product(1, "Kenge Potpuri 2022",
                    "Kenge te mira per darsma!", BigDecimal.valueOf(-99.99d),
                    LocalDate.now());
            System.out.println(cdEMedes);
            Product qumesht = new Product(2, "Vita", "Vita prashak!",
                    BigDecimal.valueOf(1), LocalDate.of(2020, 1, 1));
            System.out.println(qumesht);
        }
        catch (NegativePriceProductException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getNegativePrice());
            ex.printStackTrace();
        }
        catch (ProductException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}








