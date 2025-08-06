//Data: __/__/__
//Conteúdo: Strings

package aulas;
import utils.IO;
import utils.Cadeias;

public class Aula14 {


    public static void aula(){
        IO.imprimir("## Aula 14 - Strings ##");
    
        //Exercício 01
        // ex01();
        //Exercício 01
        //ex02();
        ex08();

    }

    /**
    * Título do exercício
    * Descrição do exercício
    */
    public static void ex01(){
        
        // System.out.printf("%c%c%c%c%c", 65+32, 108, 103, 111, 10);

        // char c = 'D';
        // System.out.printf("ascii %c : int %d\n", c, (int) c);

        // System.out.printf("%c %c\n", '\u0041', 0x262D);


    }

    /**
    * Título do exercício
    * Descrição do exercício
    */
    public static void ex02(){
        //Variáveis
        String senha = "4a5r9j03";
        String texto;

        //Entrada
        //Leitura dos valores
        texto = IO.lerPalavra("Digite a senha");

        //Processamento
        //Cálculos realizados
        // processar();
        // if( senha == texto ){
        if( senha.equals(texto) ){
            IO.imprimir("resposta: ACESSO PERMITIDO");
        }else{
            IO.imprimir("resposta:\n\tACESSO BLOQUEADO");
        }

        //Saída
        //Apresentação dos resultados   
    }

    public static void ex08(){
        mostrarPalindromo("ovo");
        mostrarPalindromo("arara");
        mostrarPalindromo("abacate");
        mostrarPalindromo("anotaramadatadamaratona");
        mostrarPalindromo("abacaxi");
        mostrarPalindromo("153");
        mostrarPalindromo("15951");
        mostrarPalindromo("X");
        mostrarPalindromo("");
    }

    public static void mostrarPalindromo(String cadeia){
        if(Cadeias.verificarPalindromo(cadeia)){
            IO.imprimir(cadeia + " é palíndromo.");
        }else{
            IO.imprimir(cadeia + " não é palíndromo.");
        }
    }

    

}
