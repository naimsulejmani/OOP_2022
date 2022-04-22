package cacttus.education.loggers;

import cacttus.education.exceptions.Product;
import cacttus.education.exceptions.ProductException;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;

public class LogTest {
    public static void main(String[] args) throws IOException {
        Log log = new Log("IFATAR_LOG", Level.INFO,
                "files/logs/iftar_log.txt", new SimpleFormatter());
        try {
            Product product = new Product(100,
                    "Pula 1/2", "Me hudhra dhe sos",
                    BigDecimal.valueOf(3.5),
                    LocalDate.now().minusMonths(1)
            );
        } catch (ProductException e) {
            log.add(e.getMessage(), Level.SEVERE);
        }
    }
}
