package cacttus.education.mini_project.models;

import cacttus.education.mini_project.exceptions.ExpireDateException;
import cacttus.education.mini_project.exceptions.NegativePriceException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.function.DoubleBinaryOperator;

public class Product {
    private int id;
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDate bestBefore;
    private Rating rating;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
        this.bestBefore = LocalDate.now();
    }

    public Product(int id, String name, String description,
                   BigDecimal price, LocalDate bestBefore, Rating rating)
            throws ExpireDateException, NegativePriceException {
        this.id = id;
        this.name = name;
        this.description = description;
        //this.price = price;
        setPrice(price);
        if (bestBefore == null || bestBefore.compareTo(LocalDate.now()) < 0) {
            throw new ExpireDateException("Afati i produktit nuk eshte valid!"
                    , bestBefore);
        }
        this.bestBefore = bestBefore;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) throws NegativePriceException {
        if (price.compareTo(BigDecimal.ZERO) < 0)
            throw new NegativePriceException("Cmimi eshte negative!", price.doubleValue());
        this.price = price;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

//    nuk ka logjike me ja ndru afatin produktit pasi eshte krijuar
//    public void setBestBefore(LocalDate bestBefore) {
//        this.bestBefore = bestBefore;
//    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format(
                "%d - %s me cmimin prej %.2f EUR i cili ka afat te skadences deri me %s dhe i vlersuar me %s",
                id, name, price, bestBefore, rating
        );
    }
}
