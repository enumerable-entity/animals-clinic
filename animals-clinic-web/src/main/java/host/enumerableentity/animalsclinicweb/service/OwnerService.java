package host.enumerableentity.animalsclinicweb.service;

import host.enumerableentity.animalsclinicmodels.model.Owner;

public interface OwnerService {
    Owner findById(Long id);

    Owner save(Owner owner);

}
