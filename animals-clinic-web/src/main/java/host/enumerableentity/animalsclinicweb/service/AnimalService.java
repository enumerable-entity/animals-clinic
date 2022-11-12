package host.enumerableentity.animalsclinicweb.service;

import host.enumerableentity.animalsclinicmodels.model.Animal;

import java.util.Set;

public interface AnimalService {
    Animal findById(Long id);

    Animal save(Animal animal);

    Set<Animal> findAll();

}
