package host.enumerableentity.animalsclinicweb.controller;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/owners")
public record OwnerController() {

    @Contract(pure = true)
    @RequestMapping(value = "", method = RequestMethod.GET)
    @NotNull
    String listOwners() {
        return "owners/index";
    }
}
