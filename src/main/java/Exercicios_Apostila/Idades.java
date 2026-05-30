package Exercicios_Apostila;

import java.util.Locale;
import java.util.Scanner;

    public class Idades {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);

            Scanner sc = new Scanner(System.in);

            System.out.println("Dados da primeira pessoa ");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("idade: ");
            int idade = sc.nextInt();

            sc.nextLine();

            System.out.println("Dados da segunda pessoa ");
            System.out.print("Nome: ");
            String nome2 = sc.nextLine();
            System.out.print("idade: ");
            int idade2 = sc.nextInt();

            int media=(idade+idade2)/2;

            System.out.print("A idade media de " + nome + "e" + nome2 + "é de " + media + "anos" );



        }
}
