//Data: __/__/__
//Conteúdo: _____

package aulas;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

import utils.IO;

public class Aula20 {


    public static void aula(){
        IO.imprimir("## Aula 20 - Arquivo binário ##");
    
        //Exercício 01
        // ex01();
        ex02();

    }

    /**
    * Título do exercício
    * Descrição do exercício
    */
    public static void ex01(){
        //Variáveis
        String nome_arquivo = "saida/dados.bin";

        //Leitura de arquivo binário
        FileInputStream file_reader = null;
        DataInputStream reader = null;

        //Escrita de arquivo binário
        FileOutputStream file_writer = null;
        DataOutputStream writer = null;


        // escrita
        try{
            file_writer = new FileOutputStream(nome_arquivo);
            writer = new DataOutputStream(file_writer);

            writer.writeInt(Integer.MIN_VALUE);
            writer.writeDouble(3.14);
            writer.writeUTF("teste");

            writer.close();
            file_writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // leitura
        // try {
        //     file_reader = new FileInputStream(nome_arquivo);
        //     reader = new DataInputStream(file_reader);

        //     int valor_int = reader.readInt();
        //     double valor_double = reader.readDouble();
        //     String valor_string = reader.readUTF();
        //     IO.imprimir(""+valor_int + " " + valor_double + " " + valor_string);

        //     reader.close();
        //     file_reader.close();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
    }

    public static void ex02(){
        // Variáveis
        RandomAccessFile file = null;
        String nome_arquivo = "dados.bin";
        int primeiro_valor, segundo_valor;

        try{
            file = new RandomAccessFile(nome_arquivo, "rw");
        }catch(IOException e){
            IO.imprimirErro("Erro durante abertura ao arquivo " + nome_arquivo + ".");
            e.printStackTrace();
        }

        try {
            // grava dois valores inteiros no arquivo
            file.writeInt(100);
            file.writeInt(200);

            // movimenta o cursor do arquivo para a posição 0 (início do arquivo)
            file.seek(0);
            primeiro_valor = file.readInt(); // lê o primeiro valor do arquivo

            file.seek(4); // movimenta para o segundo inteiro (4 bytes)
            segundo_valor = file.readInt();

            IO.imprimir("Primeiro valor: " + primeiro_valor);
            IO.imprimir("Segundo valor : " + segundo_valor);

            file.seek(0); // movimenta novamente para a posição 0

            // sobrescreve o primeiro valor
            file.writeInt(300);
            IO.imprimir("Sobrescrevendo..");

            // Lê os valores do arquivo
            file.seek(0); // movimenta novamente para a posição 0
            primeiro_valor = file.readInt();
            segundo_valor = file.readInt();

            IO.imprimir("Primeiro valor: " + primeiro_valor);
            IO.imprimir("Segundo valor : " + segundo_valor);

            file.close();

        }catch(IOException e){
            IO.imprimirErro("Erro durante o acesso ao arquivo + " + nome_arquivo + ".");
            e.printStackTrace();
        }

        try{
            file.close();
        }catch(IOException e){
            IO.imprimirErro("Erro ao fechar o arquivo " + nome_arquivo + ".");
            e.printStackTrace();
        }
    }
    

}
