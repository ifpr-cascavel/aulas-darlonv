//Data: 26/05/2025
//Conteúdo: Repositório no github

package aulas;

import utils.IO;

public class Aula04 {

    //Entrada

    //Processamento

    //Saida

    public static void aula(){
        System.out.println("Aula 04");
        //Exercício 01
        ex01();

    }

    //Exercício Teste
    //Usuário informa dois valores.
    //Deve ser retornado o maior dos valores digitados.
    public static void ex01(){
        //Variáveis
        int valor_1, valor_2, valor_maior;

        //Entrada
        IO.imprimir("Digite o primeiro valor");
        valor_1 = IO.lerValorInteiro();

        IO.imprimir("Digite o segundo valor");
        valor_2 = IO.lerValorInteiro();

        //Processamento
        valor_maior = processarMaiorValor(valor_1, valor_2);

        //Saída
        IO.imprimir("O maior valor é:");
        IO.imprimirValorInteiro(valor_maior);
    }

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
