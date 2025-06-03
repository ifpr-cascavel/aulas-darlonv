//Data: 02/06/2025
//Conteúdo: Estruturas de Repetição

package aulas;
import utils.IO;

public class Aula05 {


    public static void aula(){
        IO.imprimir("## Aula 05 - Estruturas de Repetição ##");
    
        //Exercício 01
        // ex01();
        //Exercício 02
        ex02();

    }

    /**
    * Título do exercício
    * Descrição do exercício
    */
    public static void ex01(){
        IO.imprimir("Exercício Intervalo de 10 a 200");

        //Cálculos realizados
        processarIntervaloDe10A200();
    }

    /**
    * Mostra na tela os valores de 10  200
    */
    public static void processarIntervaloDe10A200(){
        
        processarMostrarIntervalo(10, 200);
    }

    /**
    * Mostra na tela os valores em um intervalo
    * @param inicio inicio do intervalo
    * @param fim ultimo valor do intervalo
    */
    public static void processarMostrarIntervalo(int inicio, int fim){
        int indice = 0;
        for(indice=inicio; indice <= fim ; indice++){
            IO.imprimirValorInteiro(indice);
        }

    }

    /**
    * Mostra na uma sequencia de valores
    * @param inicio inicio do intervalo
    * @param fim ultimo valor do intervalo
    */
    public static void processarMostrarSequencia(int inicio, int fim){
        int incremento = 1;
        int indice = inicio;
        
        if(inicio > fim){
            incremento = -1;
        }

        while(indice != fim+incremento){
            IO.imprimirValorInteiro(indice);
            indice = indice + incremento;
        }


    }


}
