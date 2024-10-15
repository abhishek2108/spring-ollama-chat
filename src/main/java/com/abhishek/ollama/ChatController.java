package com.abhishek.ollama;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class ChatController {

    private final ChatModel chatModel;

    public ChatController(ChatModel chatModel) {
        this.chatModel = chatModel;
    }


    @GetMapping
    public String prompt(@RequestParam String message) {
        return chatModel.call(message);
    }
}
