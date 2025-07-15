/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.configuration;

import br.com.ifba.prg03spring.view.CursoListar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class SwingConfig {
    
    @Bean
    @Profile("gui") // Só cria em perfil específico
    public CursoListar cursoListar() {
        return new CursoListar();
    }
}