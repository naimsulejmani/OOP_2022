package cacttus.education.generics_interfaces.interfaces;

import java.util.List;

//T - nenkupton cfare modeli per tabele , class per tabele
//Tid - nenkupton Idne (celesin primar) te class per tabel
public interface CrudRepository<T, Tid> {
    boolean add(T item);

    boolean modify(T item);

    boolean remove(T item);

    boolean removeById(Tid id);

    T getById(Tid id);

    List<T> getAll();
}
