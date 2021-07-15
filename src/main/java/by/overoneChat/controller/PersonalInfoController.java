package by.overoneChat.controller;

import by.overoneChat.entity.PersonalInfo;
import by.overoneChat.res.MaritalStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonalInfoController {

    @GetMapping("/personalInfo")
    public ModelAndView getInfo(ModelAndView model) {
        model.setViewName("personal_info");
        return model;
    }

    @PostMapping("/personalInfo")
    public ModelAndView updateInfo(ModelAndView model,
                                   @ModelAttribute String about,
//                                   @ModelAttribute MaritalStatus status
                                   @RequestParam String myStatus
    ) {
        System.out.println("Checking");
//        System.out.println(info.getStatus());
        model.setViewName("home");
        return model;
    }
}
