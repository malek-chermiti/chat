package com.example.chat.controller;

import com.example.chat.model.Message;
import com.example.chat.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ChatController {

    @Autowired
    private MessageService messageService;

    // Réception d'un message via WebSocket et diffusion à tout le monde
    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public Message sendMessage(Message message) {
        // Sauvegarde le message en base de données (avec le timestamp auto)
        return messageService.saveMessage(message);
    }

    // (Optionnel) Une API REST classique pour récupérer l'historique des messages au chargement de la page
    @GetMapping("/messages")
    @ResponseBody
    public List<Message> getHistory() {
        return messageService.getAllMessages();
    }
}