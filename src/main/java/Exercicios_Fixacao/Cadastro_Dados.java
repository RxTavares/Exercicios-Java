package Exercicios_Fixacao;

import  java.util.Locale;
import java.util.Scanner;
public class Cadastro_Dados {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome1 = sc.nextLine();
        System.out.print("Digite sua renda mensal: ");
        double salario1 = sc.nextDouble();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Digite um sexo (F/M): ");
        char sexo = sc.next().charAt(0);

        System.out.println("Nome 1: " + nome1 );
        System.out.println("Salario 1: " + String.format("%.2f", salario1));
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        sc.close();
    }
}
