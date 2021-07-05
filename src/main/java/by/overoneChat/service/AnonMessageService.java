package by.overoneChat.service;

import by.overoneChat.entity.AnonMessage;
import by.overoneChat.repository.AnonMessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnonMessageService {

    private final AnonMessageRepository messageRepository;

    public List<AnonMessage> getAll() {
        return messageRepository.findAll();
    }

    public void save(AnonMessage message) {
        messageRepository.save(message);
    }
}
