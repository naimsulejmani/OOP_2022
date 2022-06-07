package lambda_expression;

import cacttus.education.anonymous_class.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class BasicLambda {
    public static void main(String[] args) {
        Comparator<Product> nameComparatorAC = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Comparator<Product> nameComparator = (p1, p2) -> p1.getName().compareTo(p2.getName());

        Comparator<Product> nameComparator2 = (p1, p2) -> {
            return p1.getName().compareTo(p2.getName());
        };

        Predicate<Integer> isEvenAC = integer -> integer % 2 == 0;

        Predicate<Integer> isEven = (numri) -> numri % 2 == 0;

        System.out.println(isEven.test(10));
        System.out.println(isEven.test(11));
        System.out.println(isEven.test(20));

        Predicate<Product> priceGreaterThan100 = p -> p.getPrice() > 100;
        Product product = new Product("Laptop i vjeter", "asdadsa", 99.99, 3);
        Product product1 = new Product("test", "test", 999, 4);
        System.out.println(priceGreaterThan100.test(product));

        List<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product1);

        products.removeIf(priceGreaterThan100);
        products.removeIf(product2 -> product2.getName().startsWith("A"));

        Comparator<String> stringComparator = String::compareTo;
        Predicate<Integer> isEvenMR = BasicLambda::isEven;

        System.out.println(isEvenMR.test(100));

    }


    public static boolean isEven(Integer number) {
        return number % 2 == 0;
    }
}






