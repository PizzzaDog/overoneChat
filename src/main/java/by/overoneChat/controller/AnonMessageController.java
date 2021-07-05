package by.overoneChat.controller;

import by.overoneChat.entity.AnonMessage;
import by.overoneChat.service.AnonMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/anon")
@RequiredArgsConstructor
public class AnonMessageController {

    private final AnonMessageService messageService;

    @GetMapping("/chat")
    public ModelAndView anonChat(ModelAndView model, @ModelAttribute(name = "name") String name) {
        model.addObject("messages", messageService.getAll());
        model.setViewName("anonChat");
        model.addObject("isGet", true);
        return model;
    }

    @PostMapping("/chat")
    public ModelAndView anonChatPost(ModelAndView model,
                                     @ModelAttribute(name = "name") String name,
                                     @ModelAttribute(name = "text") String text) {
        AnonMessage message = new AnonMessage();
        message.setText(text);
        message.setSender(name.isEmpty() ? "Anonymous" : name);
        messageService.save(message);
        model.addObject("messages", messageService.getAll());
        model.addObject("name", name);
        model.setViewName("anonChat");
        return model;
    }
}
