//Data: __/__/__
//Conteúdo: _____

package aulas;

import utils.IO;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aula18 {

    public static void aula() {
        IO.imprimir("## Aula 18 - Arquivos Texto ##");

        // Exercício 01
        ex01();
        // ex02();
        // ex03();

    }

    /**
     * Título do exercício
     * Descrição do exercício
     */
    public static void ex01() {
        // Variáveis
        BufferedWriter writer = null;
        FileWriter file_writer = null;

        // Gera o arquivo
        try {
            file_writer = new FileWriter("dados.txt");
            writer = new BufferedWriter(file_writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Saída
        // Salva dados no arquivo
        try {

            writer.write("Primeira linha");
            writer.newLine();
            writer.write("Segunda linha");

            writer.close();
            file_writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Apresentação dos resultados
    }

    public static void ex02() {
        // Variáveis
        BufferedWriter writer = null;
        FileWriter file_writer = null;

        // Gera o arquivo
        try {
            file_writer = new FileWriter("numeros.txt");
            writer = new BufferedWriter(file_writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Saída
        // Salva dados no arquivo
        try {

            for(int idx=1; idx<=10; idx++){
                writer.write("" + idx + "\n");    
            }

            writer.close();
            file_writer.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Apresentação dos resultados
    }

    public static void ex03() {
        // Variáveis
        BufferedWriter writer = null;
        FileWriter file_writer = null;

        String nome;
        int inicio, fim;

        //Pergunta o nome
        IO.imprimir("Nome: ");
        nome = IO.lerPalavra();

        IO.imprimir("Inicio: ");
        inicio = IO.lerValorInteiro();
        IO.imprimir("fim: ");
        fim = IO.lerValorInteiro();


        // Gera o arquivo
        try {
            file_writer = new FileWriter("/tmp/" + nome + ".txt");
            writer = new BufferedWriter(file_writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Saída
        // Salva dados no arquivo
        try {

            for(int idx=inicio; idx<=fim; idx++){
                writer.write("" + idx + "\n");    
            }

            writer.close();
            file_writer.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Apresentação dos resultados
    }

}
