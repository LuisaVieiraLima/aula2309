package aula5;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vetor = new String[6];

        System.out.println("Digite 6 letras ou caracteres:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = scanner.next();
        }

        System.out.print("Qual letra você quer procurar? ");
        String letraProcurada = scanner.next();

        boolean achou = false;

        for (int i = 0; i < 6; i++) {
            if (vetor[i].equals(letraProcurada)) {
                System.out.println("Encontrado! A letra está na posição: " + i);
                achou = true;
            }
        }

        if (achou == false) {
            System.out.println("A letra não foi encontrada no vetor.");
        }
    }
}
