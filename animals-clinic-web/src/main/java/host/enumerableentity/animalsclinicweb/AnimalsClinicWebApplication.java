package host.enumerableentity.animalsclinicweb;

import host.enumerableentity.animalsclinicmodels.model.Owner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnimalsClinicWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnimalsClinicWebApplication.class, args);

        Owner owner = new Owner();
    }

}
