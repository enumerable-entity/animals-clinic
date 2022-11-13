package host.enumerableentity.animalsclinicweb.repository;

import host.enumerableentity.animalsclinicmodels.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
