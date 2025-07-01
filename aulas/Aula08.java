//Data: __/__/__
//Conteúdo: _____

package aulas;
import utils.IO;

public class Aula08 {

    static int valor_global;

    public static void aula(){
        IO.imprimir("## Aula 08 - Escopo ##");
    
        valor_global = 10;
        //Exemplo 01
        // escopoLocal(15);

        //Exemplo 02
        // int var_exemplo = 5;
        // IO.imprimirValorInteiro(var_exemplo);
        // passagemPorValor(var_exemplo);
        // IO.imprimirValorInteiro(var_exemplo);

        //Exemplo 03 - Passagem por referência
        int[] vetor_exemplo = new int[5];
        for(int indice = 0; indice < vetor_exemplo.length; indice++){
            vetor_exemplo[indice] = indice;
        }

        for(int indice = 0; indice < vetor_exemplo.length; indice++){
            IO.imprimirValorInteiro(vetor_exemplo[indice]);
        }

        passagemPorReferencia(vetor_exemplo);

        for(int indice = 0; indice < vetor_exemplo.length; indice++){
            IO.imprimirValorInteiro(vetor_exemplo[indice]);
        }
    }

    /**
    * Escopo local
    */
    public static void escopoLocal(int param_1){
        int valor_global = 2;

        IO.imprimirValorInteiro(param_1 + valor_global);
        

    }

    public static void passagemPorValor(int param_1){

        IO.imprimirValorInteiro(param_1);
        param_1 += 10;
        IO.imprimirValorInteiro(param_1);
    }
 
    public static void passagemPorReferencia(int[] vetor){
        int[] vetor_novo = new int[vetor.length];

        for(int indice = 0; indice < vetor.length; indice++){
            vetor_novo[indice] = vetor[indice];
        }

        for(int indice = 0; indice < vetor_novo.length; indice++){
            vetor_novo[indice] += 10;
        }
    }
}
