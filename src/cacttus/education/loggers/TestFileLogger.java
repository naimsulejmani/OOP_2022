package cacttus.education.loggers;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class TestFileLogger {
    public static void main(String[] args) {
        try {
            FileHandler fileHandler =
                    new FileHandler("files/logs/log_20220422.txt", true);
            Logger logger = Logger.getLogger("TEST_FILE_LOGGER");
            logger.addHandler(fileHandler);
            logger.warning("Inti ma qete");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
