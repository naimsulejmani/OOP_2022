package cacttus.education.interfaces.ushtrimi1;

import java.util.List;

public interface VeturaRepository extends BaseRepository {

    public List<Object> getAllByModel(String model);

    public List<Object> getAllByProducer(String producer);
}
