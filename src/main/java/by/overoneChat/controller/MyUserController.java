package by.overoneChat.controller;

import by.overoneChat.entity.MyUser;
import by.overoneChat.service.MyUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class MyUserController {

    private final MyUserService userService;

    @PostMapping("/create")
    public ModelAndView createUser(ModelAndView model,
                                   @ModelAttribute MyUser user) {
        System.out.println(model.getModel().get("name"));
        model.addObject("user", userService.createUser(user));
        model.setViewName("create_user");
        return model;
    }

    @GetMapping("/create")
    public ModelAndView create(ModelAndView model) {
        model.setViewName("user");
        return model;
    }

    @GetMapping("/all")
    public ModelAndView allUsers(ModelAndView model) {
        List<MyUser> users = userService.getAll();
        model.addObject("userList", users);
        model.setViewName("userList");
        return model;
    }
}
