package aula5;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < 5; i++) {
            soma = soma + numeros[i];
        }

        System.out.println("A soma total é: " + soma);
    }
}
