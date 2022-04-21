package cacttus.education.exceptions;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDate bestBefore;

    public Product(int id, String name, String description, BigDecimal price, LocalDate bestBefore) throws NegativePriceProductException, ProductException {
        this.id = id;
        this.name = name;
        this.description = description;
        //this.price = price;
        setPrice(price);
        // this.bestBefore = bestBefore;
        setBestBefore(bestBefore);
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

    public void setPrice(BigDecimal price) throws NegativePriceProductException {
        if (price.compareTo(BigDecimal.ZERO) < 0)
            throw new NegativePriceProductException("Cmimi nuk guxon te jete negative", price);
        this.price = price;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(LocalDate bestBefore) throws ProductException {
        if (bestBefore.compareTo(LocalDate.now()) < 0)
            throw new ProductException("Ka skaduar afati! Mos shit produkte te skaduara!");
        this.bestBefore = bestBefore;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", bestBefore=" + bestBefore +
                '}';
    }
}
