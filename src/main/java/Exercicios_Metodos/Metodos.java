package Exercicios_Metodos;

public class Metodos {
    public static void main(String[] args) {

        apresentar();
        apresentar("meu texto é esse");
        String texto = getapresentar();
        System.out.println(texto);
        System.out.println(getapresentar(1)); // Aceita com ou sem parametro
        apresentarDados("000", 0);
        calcular(15, 3, '/');
            /*
            Com o return temos 2 opções:
            1. Cria uma variavel para armazenar o tipo de informação que esta sendo retornada do metodo que criou,
            2. Apresentar diretamente com System.out.println.
             */

            /*
         4  tipos de metodos:

         1. metodo sem retorno e sem parametro
         2. metodo Sem retorno e com parametro
         3. metodo com retorno e sem parametro
         4. metodo com retorno e com parametro
           */
    }
    // metodo sem retorno e sem parametro
    public static void apresentar() {
        System.out.println("Dados a serem apresentados");
    }

    //metodo sem retorno e com parametro
    public static void apresentar(String texto) {
        System.out.println(texto);
    }

    //metodo com retorno e sem parametro
    public static String getapresentar() {
        return "Texto a ser retornado";
    }

    //metodo com retorno e com parametro
    public static String getapresentar(int codigo) {
        if (codigo == 1) {
            return "1";
        } else if (codigo == 2) {
            return "2";
        } else {
            return "";
        }
    }
    public static void apresentarDados(String cpf, int cod) {
        if (cpf.equals("000")) {
            if (cod == 0) {
                System.out.println(cod);
                System.out.println("Certo");
            } else {
                System.out.println(cod);
                System.out.println("Erro");
            }
        } else if (cpf.equals("111")) {
            System.out.println(cod);
        }
    }
    public static void calcular(int x, int y, char opcao) {
        if (opcao == '+') {
            System.out.println(x + y);
        } else if (opcao == '-') {
            System.out.println(x - y);
        } else if (opcao == '*') {
            System.out.println(x * y);
        } else if (opcao == '/') {
            System.out.println(x / y);
        }
    }
    }
    //Um metodo pode ter o mesmo nome, desde que tenha parametros diferentes: ln 38-42.
    //Cada metodo é escrito com um verbo no infinitivo, pois representa uma ação.
    //Pode ter palavras atras dele como get e set.

