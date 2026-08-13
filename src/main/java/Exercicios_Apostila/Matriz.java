package Exercicios_Apostila;

public class Matriz {
    public static void main( String[] args ) {

        //While, Do While , For, Vetores e Matrizes

        int matriz [][] = new int[10][10];

        for (int i=0; i<10;i++){
            for (int j=1;j<10;j++){
                matriz[i][j] = i+j;
            }
        }
        for (int i=0; i<10;i++){
            for (int j=1;j<10;j++){
                System.out.println(matriz[i][j]);
            }
        System.out.println("\n\n");
        }

    }

}
