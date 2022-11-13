package host.enumerableentity.animalsclinicweb.controller;

import host.enumerableentity.animalsclinicweb.service.VeterinaryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/veterinaries")
public record VeterinaryController(VeterinaryService veterinaryService) {

    @RequestMapping({"/", ""})
    public ModelAndView listVeterinaries(ModelAndView model) {
        model.addObject("veterinaries", veterinaryService.findAll());
        model.setViewName("veterinary/veterinary");
        return model;
    }
}
