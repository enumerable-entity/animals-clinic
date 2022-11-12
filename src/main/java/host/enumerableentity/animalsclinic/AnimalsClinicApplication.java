package host.enumerableentity.animalsclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AnimalsClinicApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(AnimalsClinicApplication.class, args);

    }

}
