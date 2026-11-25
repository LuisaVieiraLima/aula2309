package aula4.exercicios;

import java.util.Scanner;

public class Exercicio8 {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\n--- Resultado ---");
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

        scanner.close();
    }
}
