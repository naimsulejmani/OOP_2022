package cacttus.education.generics_interfaces.interfaces;

public interface WriteableRepository<T, Tid> {
    boolean add(T item);

    boolean modify(T item);

    boolean remove(T item);

    boolean removeById(Tid id);
}
