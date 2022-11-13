package host.enumerableentity.animalsclinicweb;

import host.enumerableentity.animalsclinicmodels.model.Owner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan("host.enumerableentity.animalsclinicmodels.model")
public class AnimalsClinicWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnimalsClinicWebApplication.class, args);

        Owner owner = new Owner();
    }

}
