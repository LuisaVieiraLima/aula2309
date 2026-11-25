package aula3.exercicios;

import java.util.Scanner;

public class Exercicio5 {
    static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        double valorHoraNormal = 20.0;
        double valorHorasExtras = 0.0;


        if (horasTrabalhadas > 40) {
            int horasExtras = horasTrabalhadas - 40;
            valorHorasExtras = horasExtras + (valorHoraNormal * 1.5);
            System.out.println("O funcionário fez horas extras.");
        } else {
            System.out.println("o funcionário não fez horas extras.");
        }

        System.out.println("O valor pago pelas horas extras será: " + valorHorasExtras);

        scanner.close();
    }
}


