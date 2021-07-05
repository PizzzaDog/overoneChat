package by.overoneChat.service;

import by.overoneChat.entity.Conversation;
import by.overoneChat.repository.ConversationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConversationService {

    private final ConversationRepository conversationRepository;

    public List<Conversation> findAll() {
        return conversationRepository.findAll();
    }

//    public List<Conversation> findBy
}
