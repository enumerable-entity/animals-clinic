package host.enumerableentity.animalsclinicweb.service;

import host.enumerableentity.animalsclinicmodels.model.Veterinary;

public interface VeterinaryService {
    Veterinary findById(Long id);

    Veterinary save(Veterinary owner);
}
