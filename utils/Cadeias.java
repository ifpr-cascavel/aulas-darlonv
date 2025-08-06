package utils;
import java.util.Scanner;

public class Cadeias {
    
    
    /**
    * Função de teste de acesso à biblioteca.
    */
    public static void hello(){
        System.out.println("Hello");
    }

    /**
    * Verifica se uma cadeia de caracteres é palíndromo
    * @param cadeia Cadeia de caracteres a ser testada
    */
    public static boolean verificarPalindromo(String cadeia){
        
        int ini = 0;
        int fim = cadeia.length()-1;
        //Verifica se a cadeia de caracteres forma um palindromo
        while(ini <= fim){
            if(cadeia.charAt(ini) != cadeia.charAt(fim)){
                return false;
            }
            ini++;
            fim--;
        }
        
        return true;

    }

    
}
