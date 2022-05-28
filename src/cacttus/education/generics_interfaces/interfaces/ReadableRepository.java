package cacttus.education.generics_interfaces.interfaces;

import java.util.List;

public interface ReadableRepository<T, Tid> {
    T getById(Tid id);

    List<T> getAll();
}
