package cacttus.education.mini_project;

import cacttus.education.mini_project.exceptions.ExpireDateException;
import cacttus.education.mini_project.exceptions.NegativePriceException;
import cacttus.education.mini_project.exceptions.ProductNotFoundException;
import cacttus.education.mini_project.models.Product;
import cacttus.education.mini_project.models.Rating;
import cacttus.education.mini_project.repository.ProductRepository;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Shop {
    public static void main(String[] args) {
        //showMeny()
        //1 - Per me shtu produkt te ri
        //2 - per me gjet nje produkt sipas id
        //3- per me gjet te gjitha prroduktet sipas emrit
        //0 - Per dalje

        Product p1 = new Product(1, "Monte Choco me lajthi");
        try {
            p1.setPrice(BigDecimal.valueOf(2));
            p1.setRating(Rating.FIVE_STARS);
            Product p2 = new Product(2, "Caj turki", "caj per merak", BigDecimal.valueOf(0.50),
                    LocalDate.now(), Rating.FIVE_STARS);
            Product p3 = new Product(3, "Kafe amerikano", "direkt prej LA ne Prishtine",
                    BigDecimal.valueOf(1.5), LocalDate.now().plusDays(1), Rating.FOUR_STARS);

            ProductRepository repository = new ProductRepository();

            repository.add(p1);
            repository.add(p2);
            repository.add(p3);


            p3.setName("Kafe Amerikano!");
            p3.setRating(Rating.TWO_STARS);
            repository.modify(p3);


            System.out.println("PRINT ALL PRODUCTS");
            //Pritnojkme te gjitha produktet qe i kemi ne liste
            for (Product product : repository.getAll()) {
                System.out.println(product);
            }

            System.out.println("PRINT GET BY ID PRODUCT");

            Product findProduct2 = repository.getById(2);
            System.out.println(findProduct2);

            System.out.println("Find product less than 1.70 euro");

            for (Product product : repository.findAllByPriceLessOrEqualThan(BigDecimal.valueOf(1.70))) {
                System.out.println(product);
            }

            System.out.println("Find product with keyword (cho)");
            for (Product product : repository.findAllLikeName("cho")) {
                System.out.println(product);
            }

            System.out.println("REMOVE PRODUCT BY ID");
            repository.removeById(2);

            for (Product product : repository.getAll()) {
                System.out.println(product);
            }

            repository.modify(p2);

            //gjej produktin sipas id-se 4
            Product findProduct = repository.getById(1);

        } catch (NegativePriceException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getPrice());
            System.out.println(p1);
        } catch (ExpireDateException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getDate());
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }
}
