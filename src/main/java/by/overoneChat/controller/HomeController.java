package by.overoneChat.controller;

import by.overoneChat.service.MyUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final MyUserService userService;

    @GetMapping("/home")
    public ModelAndView homePage(ModelAndView model, @RequestParam(defaultValue = "User") String name) {
        model.addObject("name", name);
        model.setViewName("home");
        return model;
    }

    @GetMapping("/checkUsers")
    public ModelAndView checkUsers(ModelAndView model ) {
        model.addObject("users", userService.getAll());
        model.setViewName("userList");
        return model;
    }
}
