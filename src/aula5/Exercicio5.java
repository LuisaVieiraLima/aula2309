package aula5;

import java.util.Scanner;

public class Exercicio5 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = {"Victor", "Catarina", "Kirara"};

        System.out.print("Digite o nome que deseja verificar: ");
        String nomeBusca = scanner.nextLine();

        boolean encontrado = false;
         for (String nome: nomes) {
             if (nome.equalsIgnoreCase(nomeBusca)) {
                 encontrado = true;
                 break;
             }
         }

         if(encontrado) {
             System.out.println("O nome está presente no vetor.");
         } else {
             System.out.println("O nome NÃO está presente no vetor.");
         }

         scanner.close();
    }

}
