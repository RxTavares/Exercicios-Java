package Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US );

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double Nota_final = nota1 + nota2;

        if (Nota_final > 60.00) {
            System.out.println("Nota final " + String.format("%.2f",Nota_final));
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado! Se esforce!!");
        }
    }
}
