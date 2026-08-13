package Exercicios_Fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios_Fixação {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int PROD =  A * B;

        System.out.println("PROD = " + PROD);



    }
}