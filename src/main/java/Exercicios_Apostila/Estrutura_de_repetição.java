package Exercicios_Apostila;

public class Estrutura_de_repetição {
    public static void main( String[] args ) {

        //While, Do While , For, Vetores e Matrizes


        int matriz[][] = new int [20] [20];

         for ( int i=0;i<20;i++){
         for ( int j=0;j<20;j++){

            matriz [i][j] = i+j;

            }
        }
        for ( int i=0;i<20;i++){
            for ( int j=0;j<20;j++){

                System.out.println(matriz[i][j]);
            }
        }
    }

}
