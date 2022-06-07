package cacttus.education.anonymous_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestInterfaceAnonymousClass {
    public static void main(String[] args) {
        Comparator<Product> priceComparator = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                if (p1.getPrice() < p2.getPrice()) return -1;
                else if (p1.getPrice() > p2.getPrice()) return 1;
                return 0;
            }
        };

        Comparator<Product> nameComparator = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().compareTo(p2.getName());
            }
        };


        Product product1 = new Product("Coca Cola", "adasd", 100.50, 2);
        Product product2 = new Product("AAAA", "adasdsadad", 299.99, 1);

        System.out.println(priceComparator.compare(product1, product2));
        System.out.println(nameComparator.compare(product1, product2));

        System.out.println(ProductComparatorHelpers.nameComparator.compare(product1, product2));

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        Collections.sort(products, ProductComparatorHelpers.nameComparator);
        for (Product p : products) {
            System.out.printf("%s -> %.2f%n", p.getName(), p.getPrice());
        }

        System.out.println("--------------------------");
        Collections.sort(products, ProductComparatorHelpers.priceComparator);
        for (Product p : products) {
            System.out.printf("%s -> %.2f%n", p.getName(), p.getPrice());
        }


    }

}






