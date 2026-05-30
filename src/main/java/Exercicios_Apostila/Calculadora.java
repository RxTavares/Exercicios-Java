package Exercicios_Apostila;

public class Calculadora {
      static void main(String[] args) {
    // soma, subtração,divisão, resto
    // cada variavel tem um tipo de dado]
    int x = 10;
    int y = 2;
    int soma,subtracao,multiplicacao,divisao,resto;

    //calculadora
          soma = x + y;
          System.out.println("O resultado de "+x+" + "+y+" = "+soma);

          subtracao = x - y;
          System.out.println("O resultado de "+x+" - "+y+" = "+subtracao);

          multiplicacao = x * y;
          System.out.println("O resultado de "+x+" * "+y+" = "+multiplicacao);

          divisao = x / y;
          System.out.println("O resultado de "+x+" / "+y+" = "+divisao);

          resto = x % y;
          System.out.println("O resultado de "+x+" % "+y+" = "+resto);
    }
}
