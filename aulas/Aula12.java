//Data: __/__/__
//Conteúdo: _____

package aulas;
import utils.IO;

public class Aula12 {


    public static void aula(){
        IO.imprimir("## Aula 12 - Matrizes ##");
    
        //Exercício 02
        ex02();

    }

    /**
    * Título do exercício
    * Descrição do exercício
    */
    public static void ex02(){
        //Variáveis
        int[][] matriz;
        int n_linhas = 4;
        int n_colunas = 4;

        matriz = new int[n_linhas][n_colunas];
        
        //Entrada
        //Leitura dos valores
        IO.imprimir("Entre com os valores para a matriz:");
        for(int linha=0; linha < matriz.length; linha++){
            for(int coluna=0; coluna < matriz[linha].length; coluna++){
                IO.imprimir("Valor para ["+linha+"]["+coluna+"]");
                matriz[linha][coluna] = IO.lerValorInteiro();
            }
        }

        //Processamento
        //Cálculos realizados
        int contador = 0;
        for(int linha=0; linha < matriz.length; linha++){
            for(int coluna=0; coluna < matriz[linha].length; coluna++){
                if(matriz[linha][coluna] < 10){
                    contador++;
                }
            }
        }

        //Saída
        //Apresentação dos resultados   
        IO.imprimir("Total de valores menores que 10:" + contador);

        imprimir(matriz);
    }

    /**
    * Descrição do método/função
    * @param param_1 primeiro parâmetro
    * @param param_2 segundo parâmetro
    * @return valor retornado
    */
    public static void imprimir(int [][] matriz){

        
        for(int linha=0; linha < matriz.length; linha++){
            for(int coluna=0; coluna < matriz[linha].length; coluna++){
                System.out.print(matriz[linha][coluna] + " , ");
            }
        }

    }

}
