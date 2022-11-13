package host.enumerableentity.animalsclinicweb.service;

import host.enumerableentity.animalsclinicmodels.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceImpl extends AbstractCrudService<Owner, Long> implements OwnerService {

    public OwnerServiceImpl(JpaRepository<Owner, Long> repository) {
        super(repository);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
