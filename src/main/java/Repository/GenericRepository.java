package Repository;

import java.util.List;

public interface GenericRepository<T, ID> {
    T getById(ID id);

    T deleteById(ID id);
    T save(T t);

    T update(T item, ID id) ;

    List<T> getAll();
}
