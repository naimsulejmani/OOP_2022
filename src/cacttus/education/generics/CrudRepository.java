package cacttus.education.generics;

import java.util.List;

public interface CrudRepository<T> {
    public boolean add(T item);

    public boolean update(T item);

    public boolean delete(T item);

    public T getById(int id);

    public List<T> getAll();
}
