package cacttus.education.generics;

import java.util.List;

public class VlersimiRepository implements CrudRepository<Vlersimi> {
    @Override
    public boolean add(Vlersimi item) {
        return false;
    }

    @Override
    public boolean update(Vlersimi item) {
        return false;
    }

    @Override
    public boolean delete(Vlersimi item) {
        return false;
    }

    @Override
    public Vlersimi getById(int id) {
        return null;
    }

    @Override
    public List<Vlersimi> getAll() {
        return null;
    }
}
