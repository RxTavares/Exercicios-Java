package dobackaofront;

    public class Manipulação_string {
        static void main(String[] args){
            String nome = "Rafael Tavares";
    /* INDEX:
      É a posição onde cada caracter está armazenado na memoria
     */
    char caracter = nome.charAt(7);

    String primeira_letra_segundo_nome = nome.substring(7,8);
        System.out.println(primeira_letra_segundo_nome);

    String primeiro_nome = nome.substring(0,6);
        System.out.println(primeiro_nome);

    String ultimo_nome = nome.substring(7,14);
        System.out.println(ultimo_nome);

    String texto_substituto = "Guilherme";
        System.out.println(texto_substituto);

    nome = nome.replace("Rafael",texto_substituto);
        System.out.println(nome);

    int quantidade = nome.length();

    nome = nome.toUpperCase();
    System.out.println(nome);

    nome = nome.toLowerCase();
    System.out.println(nome);

    nome = nome.concat(" de Carvalho");
    nome = nome + " Barbosa";
    System.out.println(nome);

    System.out.println(nome.contains("Silva"));
    System.out.println(nome.equals("guilherme tavares de Carvalho Barbosa"));
    System.out.println(nome.indexOf(""));















    }
}
