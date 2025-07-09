package utils;
import java.util.Scanner;

public class Vetores{

    public static void imprimirVetor( int[] vetor ){

        System.out.print("[ ");
        for(int idx = 0; idx < vetor.length; idx++){
            System.out.print(vetor[idx] + " ");
        }
        System.out.println("]");
    }

    public static void imprimirVetor( double[] vetor ){

        System.out.print("[ ");
        for(int idx = 0; idx < vetor.length; idx++){
            System.out.print(vetor[idx] + " ");
        }
        System.out.println("]");
    }

    public static int[] novoVetorInt( int tamanho ){
        int[] vetor;

        vetor = new int[tamanho];

        return vetor;
    }

    public static double[] novoVetorDouble( int tamanho ){
        double[] vetor;

        vetor = new double[tamanho];

        return vetor;
    }

    public static int[] lerVetorDeInteiros(int qtde){
        int[] valores = new int[qtde]; //novoVetorInt(qtde);

        for(int idx=0; idx<qtde; idx++){
            valores[idx] = IO.lerValorInteiro();
        }

        return valores;
    }

    public static int[] removerRepetidos(int[] vetor){

        //variáveis
        int[] vetor_auxiliar = new int[vetor.length];
        int[] vetor_retorno;
        boolean repetido;
        int contador = 0;

        //Contagem de elementos não repetidos
        for(int idx = 0; idx < vetor.length; idx++){
            repetido = false;
            for(int idx2 = 0; idx2 < idx; idx2++){
                if(vetor[idx2] == vetor[idx]){
                    repetido = true;
                    break;
                }
            }
            if(!repetido){
                vetor_auxiliar[contador] = vetor[idx];
                contador++;
            }
        }

        //alocação do vetor de retorno
        vetor_retorno = new int[contador];

        //copia para o vetor de retorno
        for(int idx =0; idx < contador; idx++){
            vetor_retorno[idx] = vetor_auxiliar[idx];
        }



        return vetor_retorno;

    }
}

