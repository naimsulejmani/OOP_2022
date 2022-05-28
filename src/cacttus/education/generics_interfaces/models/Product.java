package cacttus.education.generics_interfaces.models;

import java.time.LocalDateTime;

public class Product extends BaseObject<String> {
    private int id;
    private String name;
    private String supplier; // Supplier class
    private String category; // Category class
    private double unitPrice;
    private double unitInStock;
    private boolean discontinued;//

    public Product(int id, String name, String supplier, String category, double unitPrice, double unitInStock, boolean discontinued) {
        this.id = id;
        this.name = name;
        this.supplier = supplier;
        this.category = category;
        this.unitPrice = unitPrice;
        this.unitInStock = unitInStock;
        this.discontinued = discontinued;
    }

    public Product(int id, String name, String supplier, String category, double unitPrice, double unitInStock, boolean discontinued,
                   String insertBy, LocalDateTime insertDate) {
        super(insertBy, insertDate);
        this.id = id;
        this.name = name;
        this.supplier = supplier;
        this.category = category;
        this.unitPrice = unitPrice;
        this.unitInStock = unitInStock;
        this.discontinued = discontinued;
    }

    //lombook library qe keni me perdore ne te ardhmen ose tjeter


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

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(double unitInStock) {
        this.unitInStock = unitInStock;
    }

    public boolean isDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(boolean discontinued) {
        this.discontinued = discontinued;
    }
}
