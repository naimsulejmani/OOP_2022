package cacttus.education.generics_interfaces.interfaces;

import cacttus.education.generics_interfaces.exceptions.NotFoundException;

public interface WriteableRepository<T, Tid> {
    boolean add(T item);

    boolean modify(T item) throws NotFoundException;

    boolean remove(T item);

    boolean removeById(Tid id);
}
