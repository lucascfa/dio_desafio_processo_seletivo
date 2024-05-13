package org.example;

import candidatura.ProcessoSeletivo;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String [] candidatos = {"João", "Ciclano", "Maria", "José", "Lucas", "Mateus", "Tomas", "Giovan", "Mercedes"};
        String [] candidatosSelecionados;

        int[] a = new int[4];

        ProcessoSeletivo processo = new ProcessoSeletivo();

        candidatosSelecionados = processo.selecaoCandidato(candidatos);

        for(int i = 0; i < candidatosSelecionados.length; i++){
            System.out.println("O candidato de número "  + (i+1) + " é o " + candidatosSelecionados[i]);
        }

        for(int i = 0; i < candidatosSelecionados.length; i++){
            if(candidatosSelecionados[i] != "Vazio"){
                processo.entrandoEmContato(candidatosSelecionados[i]);
            }
        }

    }

}