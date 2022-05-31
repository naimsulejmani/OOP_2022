package cacttus.education.generics_interfaces.consoles;

import cacttus.education.generics_interfaces.exceptions.ConflictException;
import cacttus.education.generics_interfaces.exceptions.NotFoundException;
import cacttus.education.generics_interfaces.models.Product;
import cacttus.education.generics_interfaces.repositories.ProductRepository;

import java.sql.SQLOutput;
import java.util.List;
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
                    updareProduct(reader);
                }
                case "p3" -> {
                    removeProduct(reader);

                }
                case "p4" -> {
                    findProductById(reader);
                }
                case "p5" -> {
                    showAllProducts();
                }
                case "p6" -> {
                    showProductCount();
                }
                case "p7" -> {
                    findProductThatStartsWith(reader);
                }
                default -> {
                    System.out.println("Nuk keni zgjedhur meny te duhur!");
                }
            }
            showMenu();
            selectedMenu = reader.nextLine();
        }

        System.out.println("Consola per menaxhim te produkteve po mbyllet!");
    }

    private static void updareProduct(Scanner reader) {
        System.out.println("Shkruani id-ne e produktit:");
        int productId = Integer.parseInt(reader.nextLine());

        Product product = repository.getById(productId);
        if (product == null) {
            System.out.println("Producti nuk u gjet!");
            return;
        }
        System.out.println("Produkti qe u gjet eshte: => " + product);
        System.out.printf("Shkruani cmimin e ri (%.2f EUR cmimi vjeter): %n",
                product.getUnitPrice());
        double newPrice = Double.parseDouble(reader.nextLine());
        product.setUnitPrice(newPrice);
        try {
            repository.modify(product);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void findProductThatStartsWith(Scanner reader) {
        System.out.println("Shkruani filterin e emrit: ");
        String filterName = reader.nextLine().toLowerCase();
        List<Product> products = repository.getAll();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(filterName)) {
                System.out.println(product);
            }
        }
    }

    private static void showProductCount() {
        System.out.printf("Numri i produkteve eshte: %d%n", repository.getAll().size());
    }

    private static void findProductById(Scanner reader) {
        System.out.println("Shkruani id=ne e produtkti: ");
        int productId = Integer.parseInt(reader.nextLine());
        Product product = repository.getById(productId);
        if (product != null)
            System.out.println(product);
        else
            System.out.println("Producti nuk u gjet ne liste!");
    }

    private static void removeProduct(Scanner reader) {
        System.out.println("Shkruani id-ne e produktit qe deshironi te fshini!");
        int productId = Integer.parseInt(reader.nextLine());

        try {
            repository.removeById(productId);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void showAllProducts() {
        List<Product> products = repository.getAll();
        for (Product product : products) {
            System.out.println(product);
        }
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
        try {
            if (repository.add(product)) {
                System.out.println("Produkti u regjistrua me sukses!");
            } else {
                System.out.println("Regjistrimi i produktit deshtoi, provoni perseri!");
            }
        } catch (ConflictException e) {
            System.out.println("Regjistrimi i produktit deshtoi per shkak te gabimit:");
            System.out.println(e.getMessage());
        }
    }
}








