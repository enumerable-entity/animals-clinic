package host.enumerableentity.animalsclinicweb.service;

import java.util.List;

public interface CrudService<T, ID> {
    List<T> findAll();

    T findById(ID id);

    T save(T entity);

    void delete(T entity);

    void deleteById(ID id);
}
