package Estrutura_Repetição;

import java.util.Scanner;
import java.util.Locale;

public class Ex_Combustivel {
    static void main ( String args[]){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um codigo (1,2,3) ou 4 para parar:  ");
        int codigo = sc.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while ( codigo != 4){
            if (codigo == 1 ){
                alcool++;
            }else if (codigo == 2) {
                gasolina++;
            }else if (codigo == 3){
                diesel++;
            }

            System.out.print("Informe um codigo (1,2,3) ou 4 para parar:  ");
            codigo = sc.nextInt();
        }
                System.out.println("Muito obrigado!!");
                System.out.println("Alcool: " +alcool);
                System.out.println("Gasolina: " +gasolina);
                System.out.println("Diesel: " +diesel);

    }
}
