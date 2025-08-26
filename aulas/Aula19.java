//Data: __/__/__
//Conteúdo: _____

package aulas;
import utils.IO;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Aula19 {


    public static void aula(){
        IO.imprimir("## Aula 19 - Leitura de Arquivo texto ##");
    
        //Exercício 01
        // ler_arquivo_texto();
        ler_arquivo_texto_completo();

    }

    /**
    * Título do exercício
    * Descrição do exercício
    */
    public static void ler_arquivo_texto(){
        //Variáveis
        FileReader file_reader = null;
        Scanner reader = null;
        String linha, palavra;
        int valor_inteiro, soma_inteiro = 0;
        double valor_real, soma_real = 0.0;
        boolean valor_logico;
        
        //Abertura do arquivo
        try {
            file_reader = new FileReader("entradas/entrada_exemplo.txt");
            reader = new Scanner(file_reader);
        }catch( IOException e){
            IO.imprimirErro("Erro ao abrir o arquivo.");
            e.printStackTrace();
        }

        //Entrada
        //Leitura da linha completa
        linha = reader.nextLine();
        IO.imprimir(linha);

        //Leitura palavra por palavra
        palavra = reader.next();
        IO.imprimir(palavra);
        palavra = reader.next();
        IO.imprimir(palavra);
        palavra = reader.next();
        IO.imprimir(palavra);

        //Leitura dos valores inteiros
        palavra = reader.next();
        IO.imprimir(palavra);
        valor_inteiro = reader.nextInt();
        soma_inteiro+=valor_inteiro;
        valor_inteiro = reader.nextInt();
        soma_inteiro+=valor_inteiro;
        valor_inteiro = reader.nextInt();
        soma_inteiro+=valor_inteiro;
        IO.imprimirValorInteiro(soma_inteiro);

        //Fechamento do arquivo
        try {
            reader.close();
            file_reader.close();
        }catch( IOException e){
            IO.imprimirErro("Erro ao abrir o arquivo.");
            e.printStackTrace();
        }
    }

    public static void ler_arquivo_texto_completo(){
        //Variáveis
        FileReader file_reader = null;
        Scanner reader = null;
        String palavra;
        int valor_inteiro;
        double valor_real;
        boolean valor_logico;
         
        //Abertura do arquivo
        try {
            file_reader = new FileReader("entradas/entrada_exemplo.txt");
            reader = new Scanner(file_reader);
        }catch( IOException e){
            IO.imprimirErro("Erro ao abrir o arquivo.");
            e.printStackTrace();
        }

        //Entrada
        //Leitura de todos os dados
        while(reader.hasNext()){
            if(reader.hasNextInt()){
                valor_inteiro = reader.nextInt();
                IO.imprimir("INTEIRO: "+ valor_inteiro);
            }else
            if(reader.hasNextDouble()){
                valor_real = reader.nextDouble();
                IO.imprimir("REAL: "+ valor_real);
            }else
            if(reader.hasNextBoolean()){
                valor_logico = reader.nextBoolean();
                IO.imprimir("LOGICO: "+ valor_logico);
            }else
            {
                palavra = reader.next();
                IO.imprimir("STRING: "+ palavra);
            }
        }

        //Fechamento do arquivo
        try {
            reader.close();
            file_reader.close();
        }catch( IOException e){
            IO.imprimirErro("Erro ao abrir o arquivo.");
            e.printStackTrace();
        }
    }

    
}
