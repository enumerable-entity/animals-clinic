package host.enumerableentity.animalsclinicweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public record VeterinaryController() {

    @RequestMapping("/veterinarians")
    public String listVeterinaries() {
        return "veterinary/veterinary";
    }
}
