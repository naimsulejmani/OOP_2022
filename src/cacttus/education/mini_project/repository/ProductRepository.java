package cacttus.education.mini_project.repository;

import cacttus.education.mini_project.exceptions.NegativePriceException;
import cacttus.education.mini_project.exceptions.ProductNotFoundException;
import cacttus.education.mini_project.models.Product;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ProductRepository {
    //ka me i ruajt te dhenat ne DB, file, memorie,...
    //kjo klase ka detyre edhe me ba interface komunikimin tone me keto te dhena
    // add, update, remove, search, filter
    //lista ku po i ruajme te dhenat tona
    private ArrayList<Product> products = new ArrayList<>();

    //metoda per me shtu nje produkt ne liste
    public void add(Product product) {
        products.add(product);
    }

    //metoda qe e ban search nje produkt sipas id-se se produktit
    public Product getById(int productId) throws ProductNotFoundException {
        //per cdo produkt qe gjendet tek lista e produkteve
        for (Product product : products) {
            if (product.getId() == productId)
                return product;
        }
        throw new ProductNotFoundException("Produkti me id=" + productId + " nuk u gjet!");
    }


    //metoda e cila fshin produktin sipas id-se se produktit, gjuan gabim nese produkti nuk gjendet
    public void removeById(int productId) throws ProductNotFoundException {
        Product product = getById(productId);
        products.remove(product);
    }

    public void modify(Product updatedProduct) throws ProductNotFoundException, NegativePriceException {
        Product oldProduct = getById(updatedProduct.getId());
        oldProduct.setName(updatedProduct.getName());
        oldProduct.setDescription(updatedProduct.getDescription());
        oldProduct.setRating(updatedProduct.getRating());
        oldProduct.setPrice(updatedProduct.getPrice());

//        try {
//            oldProduct.setPrice(updatedProduct.getPrice());
//        } catch (NegativePriceException e) {
//           //rollback kthe gjendjen qysh ka qene para modifikim
//        }

    }

    public ArrayList<Product> getAll() {
        return (ArrayList<Product>) products.clone();
    }

    public ArrayList<Product> findAllByPriceLessOrEqualThan(BigDecimal price) {
        //SELECT * FROM dbo.Product AS p WHERE p.Price<=@price
        ArrayList<Product> report = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice().compareTo(price) <= 0) {
                report.add(product);
            }
        }
        return report;
    }

    public ArrayList<Product> findAllLikeName(String name) {
        //SELECT * FROM dbo.Product AS p WHERE p.Name like '%'+@name+'%'
        ArrayList<Product> report = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                report.add(product);
            }
        }
        return report;
    }


}
