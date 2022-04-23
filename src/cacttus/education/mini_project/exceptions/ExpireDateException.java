package cacttus.education.mini_project.exceptions;

import java.time.LocalDate;

public class ExpireDateException extends Exception {
    private LocalDate date;

    public ExpireDateException(LocalDate date) {
        this.date = date;
    }

    public ExpireDateException(String message, LocalDate date) {
        super(message);
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }
}
