package Exercicios_Fixacao;

import java.util.Scanner;

public class Exercicios {
       public static void main(String[] args){

         Scanner sc = new Scanner(System.in);

         int NUMBER = sc.nextInt();
         double B = sc.nextDouble();
         double C = sc.nextDouble();

         double SALARY = (B * C);

         System.out.println("NUMBER = " + NUMBER);
         System.out.println("SALARY = "  + SALARY);

    }
}
