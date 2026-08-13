package Exercicios_Fixacao;

import java.util.Locale;
import java.util.Scanner;

    public class  Idades {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);

            Scanner scanner = new Scanner(System.in);
            int[] notas = new int [5];

            //Preenchendo o vetor com dados do usuário
            for(int i = 0;i < notas.length;i++){
                System.out.print("Digite a nota" + (i+1) + ": ");
                notas[i] = scanner.nextInt();
            }

            //Mostrando o que foi digitado

            System.out.println("\nNotas digitadas: ");
            for(int i = 0;i < notas.length;i++){
                System.out.println("Nota " + (i+1) + ": " + notas[i]);
            }

            //Calculando a soma da média
            int soma = 0;
            for(int i = 0;i < notas.length;i++){
                soma = soma + notas [i];
            }

            double media = soma / (double)notas.length;

            System.out.println("\nMedia: " + media);

            scanner.close();
        }
}
