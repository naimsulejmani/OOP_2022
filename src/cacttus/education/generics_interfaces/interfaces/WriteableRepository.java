package cacttus.education.generics_interfaces.interfaces;

import cacttus.education.generics_interfaces.exceptions.ConflictException;
import cacttus.education.generics_interfaces.exceptions.NotFoundException;

public interface WriteableRepository<T, Tid> {
    boolean add(T item) throws ConflictException;

    boolean modify(T item) throws NotFoundException;

    boolean remove(T item) throws NotFoundException;

    boolean removeById(Tid id) throws NotFoundException;
}
