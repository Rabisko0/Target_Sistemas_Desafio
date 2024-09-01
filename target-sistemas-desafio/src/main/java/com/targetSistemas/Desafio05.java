package com.targetSistemas;

import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //O usuário deve inserir uma string
        System.out.println("Digite a string que deseja inverter: ");
        String dado = scanner.nextLine();

        String invertida = inverterString(dado);

        System.out.println("String invertida: " +invertida);
    }

    public static String inverterString(String str){

        char[] caracteres = str.toCharArray();
        char[] invertido = new char[caracteres.length];

        for (int i = 0; i < caracteres.length; i++){
            invertido[i] = caracteres[caracteres.length -1 -i];
        }
        return new String(invertido);
    }
}
