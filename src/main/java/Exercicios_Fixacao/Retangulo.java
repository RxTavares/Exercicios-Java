package Exercicios_Fixacao;

import java.util.Scanner;
import java.util.Locale;

public class Retangulo {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);

        Scanner sc =new Scanner(System.in);

        System.out.print("Digite a base do retangulo: ");
        double base = sc.nextDouble();
        System.out.print("Digite a altura do retangulo: ");
        double altura = sc.nextDouble();

        double area = (base * altura);
        double perimetro = (base + altura)*2;
        double Diagonal = Math.sqrt(base*base + altura*altura);

        System.out.println("Area: "+ area);
        System.out.println("Perimetro: " + String.format("%.2f",perimetro));
        System.out.println("Diagonal: " + Math.round(Diagonal));


    }
}
