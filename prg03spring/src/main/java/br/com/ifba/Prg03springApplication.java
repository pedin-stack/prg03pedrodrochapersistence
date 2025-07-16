package br.com.ifba;

import org.springframework.boot.SpringApplication;
import  br.com.ifba.view.CursoListar;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "br.com.ifba")
public class Prg03springApplication {
    
public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(Prg03springApplication.class)
            .headless(false)
            .web(WebApplicationType.NONE)
            .run(args);
        
        CursoListar telaCursoListar = context.getBean(CursoListar.class);
        telaCursoListar.setVisible(true);
    }
}
