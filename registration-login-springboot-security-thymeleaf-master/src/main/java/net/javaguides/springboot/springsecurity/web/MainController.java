package net.javaguides.springboot.springsecurity.web;


import net.javaguides.springboot.springsecurity.model.Description;
import net.javaguides.springboot.springsecurity.model.DescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @Autowired
    DescriptionRepository descriptionRepository;


    @GetMapping(value = "/")
    public String root() {
        return "main";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/main";
    }
    @GetMapping(value = "/menu")
    public String menu() {
        return "menu";
    }

    @GetMapping(value = "/order")
    public String order() {
        return "order";
    }

    @GetMapping(value = "/menuBack")
    public String menuBack() {
        return "main";
    }
    @GetMapping(value = "/orderBack")
    public String orderBack() {
        return "main";
    }

    @RequestMapping(value = { "/makeOrder" }, method = RequestMethod.POST)
    public String makeOrder(Model model) {
        model.addAttribute("Notes",true);

        return "order";
    }


}
