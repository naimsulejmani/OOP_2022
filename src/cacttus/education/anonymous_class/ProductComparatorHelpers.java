package cacttus.education.anonymous_class;

import java.util.Comparator;

public class ProductComparatorHelpers {
    public static Comparator<Product> priceComparator = new Comparator<Product>() {
        @Override
        public int compare(Product p1, Product p2) {
            if (p1.getPrice() < p2.getPrice()) return -1;
            else if (p1.getPrice() > p2.getPrice()) return 1;
            return 0;
        }
    };

    public static Comparator<Product> nameComparator = new Comparator<Product>() {
        @Override
        public int compare(Product p1, Product p2) {
            return p1.getName().compareTo(p2.getName());
        }
    };
}
