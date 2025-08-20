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

}
