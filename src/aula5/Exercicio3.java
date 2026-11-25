package aula5;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[] valores = new boolean[8];

        System.out.println("Digite true (verdadeiro) ou false (falso) para cada posição:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Posição " + i + ": ");
            valores[i] = scanner.nextBoolean();
        }

        int contadorTrue = 0;
        for (int i = 0; i < 8; i++) {
            if (valores[i] == true) {
                contadorTrue = contadorTrue + 1;
            }
        }

        System.out.println("Quantidade de valores 'true' inseridos: " + contadorTrue);
    }
}
