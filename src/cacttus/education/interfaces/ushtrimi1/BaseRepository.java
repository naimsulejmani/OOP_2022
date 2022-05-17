package cacttus.education.interfaces.ushtrimi1;

import java.util.List;

public interface BaseRepository {
    public boolean add(Object item);

    public boolean modify(Object item);

    public boolean remove(int id);

    public boolean remove(Object item);

    public Object getById(int id);

    public List<Object> getAll();

}
