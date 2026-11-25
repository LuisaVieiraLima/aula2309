package aula4.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio10 {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        System.out.println("Digite números inteiros (número negativo para encerrar, > 100 para interromper):");

        while (true) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero > 100) {
                System.out.println("Número muito grande, interrupção realizada");
                break;
            }

            if (numero < 0) {
                break;
            }

            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        System.out.println("\n--- Números Pares ---");
        for (int p : pares) {
            System.out.print(p + " ");
        }

        System.out.println("\n\n--- Números Ímpares ---");
        for (int i : impares) {
            System.out.print(i + " ");
        }
        System.out.println();

        scanner.close();
    }
}
