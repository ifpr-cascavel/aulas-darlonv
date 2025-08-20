package utils;
import java.util.Scanner;

public class IO {
    final static Scanner tecladoScanner = new Scanner(System.in);
    
    /**
    * Função de teste de acesso à biblioteca.
    */
    public static void hello(){
        System.out.println("Hello");
    }

    /**
    * Fecha a entrada padrão.
    */
    public static void fechar(){
        tecladoScanner.close();
    }

    /**
    * Mostra uma mensagem na tela.
    * @param texto Mensagem a ser mostrada na tela
    */
    public static void imprimir(String texto){
        System.out.println(texto);
    }

    /**
    * Leitura de um valor inteiro a partir da entrada padrão
    * @return Valor inteiro obtido da entrada padrão
    */
    public static int lerValorInteiro(){
        int valor = tecladoScanner.nextInt();
        return valor;
    }

    /**
    * Mostra na tela um valor inteiro
    * @param valor Valor a ser mostrado na tela
    */
    public static void imprimirValorInteiro(int valor){
        imprimir("" + valor);
    }

    /**
    * Leitura de uma String a partir da entrada padrão
    * @return String da entrada padrão
    */
    public static String lerPalavra(){
        String texto = tecladoScanner.next();
        return texto;
    }

    /**
    * Leitura de uma String a partir da entrada padrão
    * @param mensagem Mensagem a ser mostrada ao usuário
    * @return String da entrada padrão
    */
    public static String lerPalavra(String mensagem){
        System.out.println(mensagem);
        String texto = tecladoScanner.next();
        return texto;
    }
}
