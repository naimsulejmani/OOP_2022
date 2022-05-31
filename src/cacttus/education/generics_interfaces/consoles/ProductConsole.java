package cacttus.education.generics_interfaces.consoles;

import cacttus.education.generics_interfaces.models.Product;
import cacttus.education.generics_interfaces.repositories.ProductRepository;

import java.util.Scanner;

public class ProductConsole {
    private static ProductRepository repository = new ProductRepository();

    private static void showMenu() {
        System.out.println("----------------------");
        System.out.println("P1 - Krijo produkt te ri");
        System.out.println("P2 - Modifiko produktin sipas Id-se");
        System.out.println("P3 - Fshi produktin sipas Id-se");
        System.out.println("P4 - Gjej produktin sipas Id-se");
        System.out.println("P5 - Gjej te gjitha produktet!");
        System.out.println("P6 - Shfaq numrin e produkteve");
        System.out.println("P7 - Gjej produktet sipas emrint!");
        System.out.println("EXIT - Per mbyllje te aplikacionit");
        System.out.println("-----------------------");
        System.out.print("Zgjidh njeren nga menyte: ");
    }

    public static void showConsole() {
        showMenu();
        Scanner reader = new Scanner(System.in);
        String selectedMenu = reader.nextLine();
        while (!selectedMenu.equalsIgnoreCase("EXIT")) {

            switch (selectedMenu.toLowerCase()) {
                case "p1" -> {
                    addProduct(reader);
                }
                case "p2" -> {

                }
                case "p3" -> {

                }
                case "p4" -> {

                }
                case "p5" -> {

                }
                case "p6" -> {

                }
                case "p7" -> {

                }
                default -> {
                    System.out.println("Nuk keni zgjedhur meny te duhur!");
                }
            }
        }

        System.out.println("Consola per menaxhim te produkteve po mbyllet!");
    }

    private static void addProduct(Scanner reader) {
        System.out.println("Shkruani ID-ne e produktit: ");
        int productId = Integer.parseInt(reader.nextLine()); // i ikum reader.nextInt
        System.out.print("Shkruaj emrin e produktit: ");
        String productName = reader.nextLine();
        System.out.print("Shkruani kateogrin e produktit:");
        String category = reader.nextLine();
        System.out.print("Shkruani furnitorin e produktit:");
        String supplier = reader.nextLine();
        System.out.print("Shkruani sa njesi e keni ne stok:");
        double unitInStock = Double.parseDouble(reader.nextLine());
        System.out.print("Shkruani cmimin e produktit:");
        double unitPrice = Double.parseDouble(reader.nextLine());
        Product product = new Product(productId, productName, supplier,
                category, unitPrice, unitInStock, false);
        if (repository.add(product)) {
            System.out.println("Produkti u regjistrua me sukses!");
        } else {
            System.out.println("Regjistrimi i produktit deshtoi, provoni perseri!");
        }
    }
}








