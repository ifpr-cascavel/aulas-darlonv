//Data: __/__/__
//Conteúdo: _____

package aulas;
import utils.IO;
import utils.Vetores;

public class Aula09 {


    public static void aula(){
        IO.imprimir("## Aula 09 - Vetores como entrada e Saída de Métodos/Funções ##");
    
        //Exercício 01
        // ex01(); //Método imprimirVetor
        // ex02(); //Método novoVetor
        ex03(); //Método lerVetorDeInteiros


    }

    /**
    * Método para mostrar um vetor na tela
    * Descrição do exercício
    */
    public static void ex01(){
        //Variáveis
        int[] vetor_a = {9,8,15,2,7,6};
        double[] vetor_b = {9.1,8.2,15.3,2.4};
        
        //Entrada
        //Leitura dos valores

        //Processamento
        //Cálculos realizados
        Vetores.imprimirVetor(vetor_a);
        Vetores.imprimirVetor(vetor_b);

        //Saída
        //Apresentação dos resultados   
    }

    /**
    * Método para mostrar um vetor na tela
    * Descrição do exercício
    */
    public static void ex02(){
        //Variáveis
        int[] vetor_a = Vetores.novoVetorInt(15);
        
        //Saída
        Vetores.imprimirVetor(vetor_a);
    }

    /**
    * Leitura de valores digitados pelo usuário
    * Descrição do exercício
    */
    public static void ex03(){
        //Variáveis
        int[] vetor_a;
        int qtde = 5;

        //Entrada
        IO.imprimir("Entre com " + qtde + " valores para o vetor");
        vetor_a = Vetores.lerVetorDeInteiros(qtde);
        
        //Saída
        Vetores.imprimirVetor(vetor_a);
        
    }

    
}
