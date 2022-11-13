package host.enumerableentity.animalsclinicweb.repository;

import host.enumerableentity.animalsclinicmodels.model.Veterinary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeterinaryRepository extends JpaRepository<Veterinary, Long> {
}
