package com.abhishek.ollama;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringOllamaChatApplicationTests {

    @Test
    void contextLoads() {
        assertDoesNotThrow(() -> SpringOllamaChatApplication.main(new String[]{}));
    }

}
