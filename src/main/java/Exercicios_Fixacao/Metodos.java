package Exercicios_Fixacao;

public class Metodos {
    public static void main(String[] args) {

        String texto = "rafael tavares de carvalho barbosa";
        String palavra = "";

        char caracter;

        for ( int i=0;i<texto.length();i++){
            caracter = texto.charAt(i);
            if (caracter == ' '){
                System.out.println("É um espaço");
                System.out.println(palavra);
                palavra = "";
            }else{
                palavra += caracter;
            }
        }
        System.out.println(palavra);
        palavra="";

    }
}