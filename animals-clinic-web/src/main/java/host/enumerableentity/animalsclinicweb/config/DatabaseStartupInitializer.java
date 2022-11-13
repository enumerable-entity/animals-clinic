package host.enumerableentity.animalsclinicweb.config;

import host.enumerableentity.animalsclinicmodels.model.Owner;
import host.enumerableentity.animalsclinicmodels.model.Veterinary;
import host.enumerableentity.animalsclinicweb.service.OwnerService;
import host.enumerableentity.animalsclinicweb.service.VeterinaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DatabaseStartupInitializer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VeterinaryService veterinaryService;

    @Override
    public void run(String... args) throws Exception {

        ownerService.save(Owner.builder().firstName("John").lastName("Doe").build());
        veterinaryService.save(Veterinary.builder().firstName("John").lastName("Doe").build());
    }
}
