package by.overoneChat.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityCheckController {

    @GetMapping("/sec")
    //Аннотация разрешает доступ только тем, у кого есть роль ROLE_USER
    @PreAuthorize("hasRole('USER')")
    public ModelAndView user(ModelAndView model) {
        model.setViewName("sec");
        return model;
    }

    @GetMapping("/adm")
    //Аннотация разрешает доступ только тем, у кого есть роль ROLE_ADMIN
    @PreAuthorize("hasRole('ADMIN')")
    public ModelAndView admin(ModelAndView model) {
        model.setViewName("adm");
        return model;
    }
}
