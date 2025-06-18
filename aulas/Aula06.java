//Data: __/__/__
//Conteúdo: _____

package aulas;
import utils.IO;

public class Aula06 {


    public static void aula(){
        IO.imprimir("## Aula 06 - Exercícios ##");
    
        //Exercício 01
        // exCrescenteDecrescente();
        //Exercício 02
        exSomaImparesConsecutivosI();

    }

    /**
    * Crescente e Decrescente
    * Descrição do exercício
    */
    public static void exCrescenteDecrescente(){
        //Variáveis
        int valor_x, valor_y;
        
        //Entrada
        //Leitura dos valores
        

        do{
            valor_x = IO.lerValorInteiro();
            valor_y = IO.lerValorInteiro();
            
            if(valor_x > valor_y){
                IO.imprimir("Decrescente");
            }

            if(valor_x < valor_y){
                IO.imprimir("Crescente");
            }
            
        }while(valor_x != valor_y);
        

    }


    public static void exSomaImparesConsecutivosI(){
        //Variáveis
        int valor_inicial, valor_final, soma=0, incremento=1;
        
        //Entrada
        //Leitura dos valores
        valor_inicial = IO.lerValorInteiro();
        valor_final = IO.lerValorInteiro();

        if(valor_inicial > valor_final){
            incremento = -1;
        }

        for(int indice = valor_inicial + incremento ; 
                indice *incremento < valor_final * incremento ; 
                indice += incremento)
            {
            if(indice % 2 != 0){
                soma+=indice;
            }
        }

        // if(valor_inicial < valor_final){
        //     for(int indice = valor_inicial+1; indice < valor_final; indice++){
        //         if(indice % 2 != 0){
        //             soma = soma + indice; // soma+=indice;
        //         }
        //     }
        // }else{
        //     for(int indice = valor_inicial-1; indice > valor_final; indice--){
        //         if(indice % 2 != 0){
        //             soma = soma + indice; // soma+=indice;
        //         }
        //     }
        // }

        IO.imprimirValorInteiro(soma);
        
        

    }
}
