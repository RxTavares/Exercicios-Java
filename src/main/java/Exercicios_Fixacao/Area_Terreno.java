package Exercicios_Fixacao;

import java.util.Scanner;
import java.util.Locale;

public class Area_Terreno {
    public static void main(String[] args){
    Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura do terreno: ");
        double larg = sc.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        double comp = sc.nextDouble();
        System.out.print("Digite o valor em metro quadrado: ");
        double metQuad = sc.nextDouble();

        double Area_Terreno = (larg * comp);
        double Preço_Terreno = metQuad * Area_Terreno;

        System.out.println("Area do terreno: " + String.format("%.2f", Area_Terreno) + " m^2");
        System.out.println("Preço do terreno: "+ String.format("R$ %.2f",Preço_Terreno) + " m^2");

    }
}
