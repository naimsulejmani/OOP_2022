package cacttus.education.generics_interfaces.repositories;

import cacttus.education.generics_interfaces.exceptions.NotFoundException;
import cacttus.education.generics_interfaces.interfaces.BaseRepository;
import cacttus.education.generics_interfaces.models.Product;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements BaseRepository<Product, Integer> {
    private List<Product> products = new ArrayList<>();

    @Override
    public Product getById(Integer id) {
        //SELECT * FROM dbo.Products where Id=@id;
        Product product = null;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                product = products.get(i);
                break;
            }

        }
        return product;
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public boolean add(Product item) {
        return products.add(item);
    }

    @Override
    public boolean modify(Product item) throws NotFoundException {
        Product product = getById(item.getId());
        if (product == null) {
            throw new NotFoundException(
                    String.format("Product with id={%d} not found!",
                            item.getId()));
        }
        /*
                UPDATE dbo.Products
                SET
                    Category = @category,
                    Discontinued = @discontinued,
                    Name = @name. ,...
                WHERE Id=@id;

         */

        product.setCategory(item.getCategory());
        product.setDiscontinued(item.isDiscontinued());
        product.setName(item.getName());
        product.setSupplier(item.getSupplier());
        product.setUnitInStock(item.getUnitInStock());
        product.setUnitPrice(item.getUnitPrice());
        product.setUpdateDate(LocalDateTime.now());
        product.setUpdateNo(product.getUpdateNo() + 1);
        product.setUpdateBy(item.getUpdateBy());
        return true;
    }

    @Override
    public boolean remove(Product item) throws NotFoundException {
        return removeById(item.getId());
    }

    @Override
    public boolean removeById(Integer id) throws NotFoundException {
        /*
            DELETE FROM dbo.Products WHERE Id=@id;
         */
        Product product = getById(id);
        if (product == null) {
            throw new NotFoundException(
                    String.format("Product with id={%d} not found!", id)
            );
        }
        return products.remove(product);
    }
}








