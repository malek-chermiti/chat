package com.example.chat.service;

import com.example.chat.model.Message;
import com.example.chat.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    // Sauvegarder un message en base de données
    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }

    // Récupérer l'historique de tous les messages
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }
}