package by.overoneChat.controller;

import by.overoneChat.entity.MyUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthenticationController {

    @GetMapping("/login")
    public ModelAndView login(@ModelAttribute MyUser user, ModelAndView model) {
        model.setViewName("login");
        return model;
    }

    @PostMapping("/login")
    public ModelAndView signIn(@ModelAttribute MyUser user, ModelAndView model) {
        model.setViewName("home");
        return model;
    }
}
