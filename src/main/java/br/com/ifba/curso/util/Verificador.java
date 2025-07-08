/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.util;

import br.com.ifba.curso.entity.Curso;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Casa
 */
public class Verificador {

    public boolean objetoNulo(Curso curso) {

        if (curso == null) {

            return true;

        } else {

            return false;

        }

    }

    public boolean stringVazia(String texto) {

        if (texto.isBlank()) {

            return true;

        } else {

            return false;

        }

    }

    public boolean verificarStatusComboBox(javax.swing.JComboBox<String> comboBox) {//realoquei para esta classe

        String selecao = (String) comboBox.getSelectedItem();

        if (selecao.equals("Ativo")) {

            return true;
        } else {

            return false;
        }

    }

    public boolean tabelaVazia(List listaCursos) {

        if (listaCursos.isEmpty()) {

            return true;

        } else {

            return false;

        }

    }

    public boolean objetoeUnico(Curso curso1, Curso curso2) {

        if (curso1.getId().equals(curso2.getId())) { // uso do 'equals' ao invés de '==' pois Long é uma wrapper nao um tipo primitivo tal qual long

            return false;

        } else {

            return true;

        }

    }

    public boolean tabelaSelecionada(int itemSelecionado) {

        if (itemSelecionado == -1) {

            return false;

        } else {

            return true;

        }

    }

    
    
}
