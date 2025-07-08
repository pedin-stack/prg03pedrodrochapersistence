/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.util;
import br.com.ifba.curso.entity.Curso;
import javax.swing.JOptionPane;

/**
 *
 * @author Casa
 */
public class Output {
    
    JOptionPane jop = new JOptionPane();
    
    public void msgnenhumcursoCadastrado(javax.swing.JOptionPane jop){
    
    jop.showMessageDialog(null, "Nenhum curso cadastrado");
    
    }
    
    public int confirmarExclusao(javax.swing.JOptionPane jop, Curso cursoExcluir ){
    
      int resposta =  jop.showConfirmDialog(
                null,
                "Deseja realmente excluir o curso:\n" + cursoExcluir.getNome() + "?",
                "Confirmação de exclusão",
                JOptionPane.YES_NO_OPTION
        );
        
        return resposta ;
        
    }
    
}
