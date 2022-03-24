package cacttus.education.lists;

import java.time.LocalDate;

public class TodoItem {

    private String name;
    private LocalDate createdDate;
    private boolean completed;


    public TodoItem(String name) {
        this(name, LocalDate.now(), false);
    }

    public TodoItem(String name, LocalDate createdDate) {
        this(name, createdDate, false);
    }

    public TodoItem(String name, LocalDate createdDate, boolean completed) {
        this.name = name;
        this.createdDate = createdDate;
        this.completed = completed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    /*
        Projekti 1, 20.02.2022, E PERFUNDUAR
        20.02.2022 -> Projetki 1 (E PERFUNDUAR)
        20.02.2022 -> Projekti 1 (E PA PERFUNDUAR)

        20.02.2022 -> Projketi 1 (YES)
     */

    @Override
    public String toString() {
        return String.format("%s -> %s (%s)",
                createdDate,
                name,
                completed ? "YES" : "NO"
        );
    }
}










