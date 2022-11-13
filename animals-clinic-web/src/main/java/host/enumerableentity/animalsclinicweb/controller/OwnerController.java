package host.enumerableentity.animalsclinicweb.controller;

import host.enumerableentity.animalsclinicweb.service.OwnerService;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/owners")
public record OwnerController(OwnerService ownerService) {

    @Contract(pure = true)
    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    @NotNull
    ModelAndView listOwners(ModelAndView model) {

        model.addObject("owners", ownerService.findAll());
        model.setViewName("owners/owners");
        return model;
    }
}
