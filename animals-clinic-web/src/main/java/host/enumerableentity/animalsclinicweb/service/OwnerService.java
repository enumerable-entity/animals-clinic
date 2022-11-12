package host.enumerableentity.animalsclinicweb.service;

import host.enumerableentity.animalsclinicmodels.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
