package cacttus.education.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoItemTest {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        //nje liste me todoItems
        ArrayList<TodoItem> todoItems = new ArrayList<>();
        showMenu();

        String selected = reader.nextLine().toUpperCase();

        TodoMenu menu = TodoMenu.valueOf(selected);

        while (menu != TodoMenu.EXIT) {
            switch (menu) {
                case ADD:
                    callAddMenu(todoItems);
                    break;
                case UPDATE:
                    callUpdateMenu(todoItems);
                    break;
                case ONE:
                    callGetOneMenu(todoItems);
                    break;
                case REMOVE:
                    callRemoveOneMenu(todoItems);
                    break;
                case ALL:
                    callAllMenu(todoItems);
                    break;
                case CLEAR:
                    clearAllMenu(todoItems);
                    break;
            }

            showMenu();
            selected = reader.nextLine().toUpperCase();
            menu = TodoMenu.valueOf(selected);
        }
//CTRL + / -> komentohet kodi pasi e keni selektuar
//        TodoItem item = new TodoItem("Perfundo metoden kalkulo pagen",
//                LocalDate.of(2022, 3, 24));
//        System.out.println(item);
//        TodoItem item1 = new TodoItem("Pregaditja per interviste");
//        System.out.println(item1);
//
//        TodoItem item2 = new TodoItem("Test 1",
//                LocalDate.now().minusDays(10), true
//        );
//        System.out.println(item2);
//
//
//        todoItems.add(item);
//        todoItems.add(item1);
//        todoItems.add(item2);


    }

    private static void clearAllMenu(ArrayList<TodoItem> todoItems) {
        System.out.println("Ju jeni duke i fshire te gjitha te dhenat!");
        System.out.println(
                "A jeni i sigurte (shtyp PO per ti fshire!, tjeter per ti  ra pishman!) ");
        boolean aJeISigurte = reader.nextLine().toUpperCase().equals("PO");

        if (aJeISigurte) {
            todoItems.clear();
            System.out.println("Shkum posht!");
        } else {
            System.out.println("Pishmanli!");
        }
    }

    private static void callAllMenu(ArrayList<TodoItem> todoItems) {
        System.out.println("Lista me todo items!");
        int index = 0;
        System.out.println("---------------------------");
        for (TodoItem item : todoItems) {
            System.out.println(index + ": " + item);
            index++;
        }
        System.out.println("---------------------------");
    }

    private static void callRemoveOneMenu(ArrayList<TodoItem> todoItems) {

    }

    private static void callGetOneMenu(ArrayList<TodoItem> todoItems) {

    }

    private static void callUpdateMenu(ArrayList<TodoItem> todoItems) {
        System.out.println("Zgjidh njeren nga tasqet e meposhtme sipas numrit fillestare!:");
        callAllMenu(todoItems);
        int index = reader.nextInt();
        reader.nextLine(); //zbraze buffer
        if (index < todoItems.size()) {
            TodoItem item = todoItems.get(index);
            item.setCompleted(!item.isCompleted());
            System.out.println("Statusi u ndryshua me sukses!");
            System.out.println("-------------------------");
            System.out.println(item);
            System.out.println("-------------------------");
        } else {
            System.out.println("Indexi jashte vlerave te lejuara!");
        }
    }

    private static void callAddMenu(ArrayList<TodoItem> todoItems) {
        System.out.println("Shkruaj emrin e taskut: ");
        String name = reader.nextLine();

        TodoItem newTodoItem = new TodoItem(name);
        todoItems.add(newTodoItem);
        System.out.println("Tasku i meposhtem u shtua me sukses!");
        System.out.println("-------------------------");
        System.out.println(todoItems);
        System.out.println("-------------------------");
    }

    private static void showMenu() {
        //ketu do ti shfaqim te gjitha menyte e ketij aplikacioni
        System.out.println("Welcome to Personal Task Manager");
        System.out.println("Choose one of the menu: ");
        System.out.println("-------------------------------------------");
        System.out.println("ADD - Per me shtu nje todo!");
        System.out.println("UPDATE - Per te azhurnuar nje todo!");
        System.out.println("ONE - Per te zgjedhur nje todo!");
        System.out.println("ALL - Per te shfaqur te gjitha todo-te!");
        System.out.println("REMOVE - Per te fshire nje todo!");
        System.out.println("CLEAR - per te fshire te gjitha todo-te!");
        System.out.println("EXIT - per te mbyllur aplikacionin!");
        System.out.println("-------------------------------------------");
        System.out.println("Zgjedhja juaj eshte: ");
    }
}






