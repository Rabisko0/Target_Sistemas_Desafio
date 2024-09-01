package com.targetSistemas;

public class Desafio01 {
    public static void main(String[] args) {

        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE){
            K += 1;
            SOMA += K;
        }

        System.out.println(SOMA);
        //O valor final da variável soma é 91
    }
}
