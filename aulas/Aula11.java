//Data: __/__/__
//Conteúdo: _____

package aulas;
import utils.IO;
import utils.Vetores;

public class Aula11 {


    public static void aula(){
        IO.imprimir("## Aula 11 - Exercício Vetores ##");
    
        //Exercício 30
        ex30();

    }

    /**
    * Título do exercício
    * Descrição do exercício
    */
    public static void ex30(){
        
        //Variáveis
        int[] vetor_entrada = {1, 2, 3, 1, 4, 0, 3, 9};
        int[] vetor_saida;

        //Processamento
        vetor_saida = Vetores.removerRepetidos(vetor_entrada);

        //Saída
        Vetores.imprimirVetor(vetor_saida);
    }

    /**
    * Descrição do método/função
    * @param param_1 primeiro parâmetro
    * @param param_2 segundo parâmetro
    * @return valor retornado
    */
    public static int processar(int param_1, int param_2){
        
        return 0;
    }

}
