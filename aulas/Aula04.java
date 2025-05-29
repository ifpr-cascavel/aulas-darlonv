//Data: 28/05/2025
//Conteúdo: Organização do repositório, Makefile e Testes

package aulas;
import utils.IO;

public class Aula04 {


    public static void aula(){
        System.out.println("## Aula 04 - Organização do repositório, Makefile e Testes ##");
    
        //Exercício 01
        ex01();

    }

    /**
    * Exercício teste.
    * Usuário deve informar dois valores inteiros, e irá retorna o maior entre os valores digitados.
    */
    public static void ex01(){
        //Variáveis
        int valor_1, valor_2, valor_maior;

        //Entrada
        //Leitura do primeiro valor
        IO.imprimir("Digite o primeiro valor");
        valor_1 = IO.lerValorInteiro();

        //Leitura do segundo valor
        IO.imprimir("Digite o segundo valor");
        valor_2 = IO.lerValorInteiro();

        //Processamento
        //Calcula e retorna o menor entre os valores
        valor_maior = processarMaiorValor(valor_1, valor_2);

        //Saída
        //Apresenta o maior valor digitado pelo usuário
        IO.imprimir("O maior valor é:");
        IO.imprimirValorInteiro(valor_maior);
    }

    /**
    * Verifica qual é o o maior valor entre os parâmetros passados
    * @param valor_1 primeiro valor
    * @param valor_2 segundo valor
    * @return o maior valor entre valor_1 e valor_2
    */
    public static int processarMaiorValor(int valor_1, int valor_2){
        
        int valor_maior = 0;

        if(valor_1 > valor_2){
            valor_maior = valor_1;
        }else{
            valor_maior = valor_1; //ERRADO!!
        }

        return valor_maior;
    }

}
