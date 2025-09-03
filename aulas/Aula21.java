//Data: __/__/__
//Conteúdo: _____

package aulas;
import java.io.File;

import utils.IO;

public class Aula21 {


    public static void aula(){
        IO.imprimir("## Aula 21 - Listar arquivos ##");
    
        //Exercício 01
        listar_arquivos();

    }

    /**
    * Listar arquivos
    * Listar arquivos no diretório atual
    */
    public static void listar_arquivos(){
        //Variáveis
        File dir_atual;
        
        //Entrada
        //Abre diretório
        dir_atual = new File(".");
        
        // Lista arquivos do diretório
        File[] arquivos = dir_atual.listFiles();
        if( arquivos != null){
            for(int idx=0; idx < arquivos.length; idx++){
                File arq = arquivos[idx];
                IO.imprimir("Arq: " + arq.getName() + "\t" + arq.getAbsolutePath() + "\t" + arq.isDirectory());
                // IO.imprimir("Arq: " + arquivos[idx].getName());
            }
        }
        

        //Processamento
        


        //Saída
        //Apresentação dos resultados
    }

   

}
