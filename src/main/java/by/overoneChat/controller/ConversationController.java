package by.overoneChat.controller;

import by.overoneChat.service.ConversationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/conversation")
@RequiredArgsConstructor
public class ConversationController {

    private final ConversationService conversationService;

    @GetMapping("/{id}")
    public ModelAndView getConversation(ModelAndView model, @PathVariable int id) {
        return null;
    }

    @GetMapping("/all")
    public ModelAndView getAllConversation(ModelAndView model) {
        return null;
    }
}
