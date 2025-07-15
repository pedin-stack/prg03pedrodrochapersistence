package br.com.ifba.prg03spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "spring.profiles.active=test")
class Prg03springApplicationTests {

    @Test
    void contextLoads() {
        // Teste vazio apenas para validar configuração
    }
}
