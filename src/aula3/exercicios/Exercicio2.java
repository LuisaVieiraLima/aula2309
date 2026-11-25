package aula3.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da sua compra: ");
        double valorCompra = scanner.nextDouble();
        double valorFinal;

        if (valorCompra >= 100.0) {
            double desconto = valorCompra * 0.1;
            valorFinal = valorCompra - desconto;
            System.out.println("Desconto de 10% aplicado.");
        } else{
            valorFinal = valorCompra;
            System.out.println("Nenhum desconto encontrado.");
        }

        System.out.println("Valor final da compra: " + valorFinal);

        scanner.close();

    }
}


