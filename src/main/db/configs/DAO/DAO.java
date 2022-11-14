package db.configs.DAO;

import java.util.List;

public interface DAO {
    public boolean add(Object obj);

    public boolean update(Object obj);

    public boolean remove(Object obj);

    public Object search(Object obj);

    public List<Object> searchAll(Object obj);
}
