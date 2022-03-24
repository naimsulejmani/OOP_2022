package cacttus.education.lists;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class TodoItemTest {
    public static void main(String[] args) {


//nje liste me todoItems
        ArrayList<TodoItem> todoItems = new ArrayList<>();
        showMenu();

        Scanner reader = new Scanner(System.in);
        String selected = reader.nextLine().toUpperCase();

        TodoMenu menu = TodoMenu.valueOf(selected);

        while (menu != TodoMenu.EXIT) {
            switch (menu) {
                case ADD:
                    call_add_menu(todoItems);
                    break;
                case UPDATE:
                    call_update_menu(todoItems);
                    break;
                case ONE:
                    call_one_menu(todoItems);
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

    private static void call_one_menu(ArrayList<TodoItem> todoItems) {

    }

    private static void call_update_menu(ArrayList<TodoItem> todoItems) {

    }

    private static void call_add_menu(ArrayList<TodoItem> todoItems) {

    }

    private static void showMenu() {
        //ketu do ti shfaqim te gjitha menyte e ketij aplikacioni
    }
}
