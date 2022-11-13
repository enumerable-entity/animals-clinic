package host.enumerableentity.animalsclinicweb.service;

import host.enumerableentity.animalsclinicmodels.model.Veterinary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class VeterinaryServiceImpl extends AbstractCrudService<Veterinary, Long> implements VeterinaryService {

    public VeterinaryServiceImpl(JpaRepository<Veterinary, Long> repository) {
        super(repository);
    }
}
