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
}

