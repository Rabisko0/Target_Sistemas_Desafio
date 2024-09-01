package com.targetSistemas;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //O usuário deve inserir o número
        System.out.println("Digite o numero que deseja verificar se pertence a sequência de Fibonacci: ");
        int num = scanner.nextInt();

        if (isFibonacci(num)){
            System.out.println("O número "+ num + " pertence à sequência.");
        } else {
            System.out.println("O número "+ num + " não pertence à sequência.");
        }

        scanner.close();
    }

    public static boolean isFibonacci(int num) {
        if (num < 0) {
            return false;
        }

        int a = 0;
        int b = 1;

        while (a < num) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a == num;
    }
}

