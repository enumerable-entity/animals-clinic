package host.enumerableentity.animalsclinicweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public record WelcomeController() {

    @RequestMapping({"", "/", "index", "index.html"})
    public String welcome() {
        return "index";
    }
}
