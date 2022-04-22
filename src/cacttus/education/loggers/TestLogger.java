package cacttus.education.loggers;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestLogger {
    private static Logger logger = Logger.getLogger(TestLogger.class.getName());

    public static void main(String[] args) {
        try {
                throw new Exception("U kall loja, Chelsea ka hup prej Arsenalit!");
        } catch (Exception ex) {
                logger.log(Level.WARNING, ex.getMessage());
        }
        finally {
            logger.log(Level.INFO, "Ne rregull e nderroj ekipin");
            logger.info("Po behem me Realin!");
        }
    }
}






