package Repository;

import java.util.List;

public interface GenericRepository<T, ID> {
    T getById(ID id);

    void deleteById(ID id);
    T save(T t);

    T update(T item);

    List<T> getAll();
}
