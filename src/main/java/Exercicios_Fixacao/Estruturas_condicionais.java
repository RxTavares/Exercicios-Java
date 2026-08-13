package Exercicios_Fixacao;

public class Estruturas_condicionais {
    static void main(String[] args) {
        // If,else
        int x = 5;
        int y = -2;
        int soma = x + y;

        if (soma > 10 ){  // maior ou igual
            System.out.println("É maior que 10");
        }else if (soma < 10){
            System.out.println("É menor que 10");
        } else {
            System.out.print("É 10");
        }
        boolean ehVerdade = (10+5 == 15 ? true : false); //if ternario
        System.out.println(ehVerdade);

        //Switch
        int z = 2;

        switch (z) {
            case 10:
                System.out.println("É 10");
                break;
            case 5:
                System.out.println("É 5");
                break;
            default:
                System.out.println("Não é 10");
                break;
        }

    }
}