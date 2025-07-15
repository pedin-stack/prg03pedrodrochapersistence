package br.com.ifba;

import br.com.ifba.prg03spring.view.CursoListar;
import javax.swing.SwingUtilities;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {
    "br.com.ifba",
    "br.com.ifba.prg03spring",
    "br.com.ifba.config",
    "br.com.ifba.infrastructure" // Adicione este
})
public class Prg03springApplication {

    public static void main(String[] args) {
      ConfigurableApplicationContext context = new SpringApplicationBuilder(Prg03springApplication.class)
        .headless(false)
        .profiles("gui")
        .run(args);
    
    // Executar na thread correta
    SwingUtilities.invokeLater(() -> {
        CursoListar frame = context.getBean(CursoListar.class);
        frame.setVisible(true);
    }); 
    }
}
