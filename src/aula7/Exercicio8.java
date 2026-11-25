package aula7;

import java.util.Scanner;

public class Exercicio8 {



        public static long calcularFatorial(int numero) {

            long fatorial = 1;

            for (int i = 1; i <= numero; i++) {

                fatorial *= i;

            }

            return fatorial;

        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número inteiro positivo: ");

            int num = scanner.nextInt();

            if (num < 0) {

                System.out.println("Por favor, digite apenas números positivos.");

            } else {

                long resultado = calcularFatorial(num);

                System.out.println("O fatorial de " + num + " é: " + resultado);

            }

            scanner.close();

        }

    }

