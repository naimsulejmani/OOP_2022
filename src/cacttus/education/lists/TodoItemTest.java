package cacttus.education.lists;

import java.util.ArrayList;
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

    }

    private static void callAllMenu(ArrayList<TodoItem> todoItems) {

    }

    private static void callRemoveOneMenu(ArrayList<TodoItem> todoItems) {

    }

    private static void callGetOneMenu(ArrayList<TodoItem> todoItems) {

    }

    private static void callUpdateMenu(ArrayList<TodoItem> todoItems) {

    }

    private static void callAddMenu(ArrayList<TodoItem> todoItems) {

    }

    private static void showMenu() {
        //ketu do ti shfaqim te gjitha menyte e ketij aplikacioni
    }
}
