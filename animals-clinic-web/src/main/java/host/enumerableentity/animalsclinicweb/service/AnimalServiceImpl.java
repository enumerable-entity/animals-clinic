package host.enumerableentity.animalsclinicweb.service;

import host.enumerableentity.animalsclinicmodels.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public class AnimalServiceImpl extends AbstractCrudService<Animal, Long> implements AnimalService {

    public AnimalServiceImpl(JpaRepository<Animal, Long> repository) {
        super(repository);
    }
}
