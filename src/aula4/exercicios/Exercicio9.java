package aula4.exercicios;

import java.util.Scanner;
import java.util.Random;

public class Exercicio9 {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

         int numeroSecreto = random.nextInt(100) + 1;
        int palpite;
        int tentativas = 0;

        System.out.println("=== Jogo de Adivinhação ===");
        System.out.println("Tente adivinhar o número entre 1 e 100!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é MAIOR. Tente novamente!");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é MENOR. Tente novamente!");
            }
        } while (palpite != numeroSecreto);

        System.out.println("\nParabéns! Você acertou o número " + numeroSecreto + "!");
        System.out.println("Total de tentativas: " + tentativas);

        scanner.close();
    }
}
