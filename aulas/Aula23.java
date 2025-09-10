//Data: __/__/__
//Conteúdo: _____

package aulas;
import java.util.LinkedList;
import java.util.Queue;

import utils.IO;

public class Aula23 {


    public static void aula(){
        IO.imprimir("## Aula 23 - Filas ##");
    
        //Exercício 01
        // ex01();

        //Exercício 02
        ex02();

    }

    /**
    * Título do exercício
    * Descrição do exercício
    */
    public static void ex01(){
        //Variáveis
        Queue<String> fila = new LinkedList<>();
        String valor;
        
        //Entrada
        fila.add("Tiranossauro");
        fila.add("Espinossauro");
        fila.add("Darlonossauro");
        fila.add("Braquiossauro");
        fila.add("Javassauro");

        System.out.println("Fila: " + fila);

        valor = fila.peek(); // Obter o valor, sem retirar
        System.out.println("Valor consultado: " + valor);
        System.out.println("Fila: " + fila);

        valor = fila.poll(); // Retirar da fila
        System.out.println("Valor retirado: " + valor);
        System.out.println("Fila: " + fila);


        System.out.println("Esta vazia? " + fila.isEmpty());

        while(! fila.isEmpty()){
            valor = fila.poll(); // Retirar da fila
            System.out.println("Valor retirado: " + valor);
            System.out.println("Fila: " + fila);
            for(int n=0; n < 10; n++){
                System.out.print(".");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            System.out.println();
            
        }

        
    }

    public static LinkedList<String> cadastrarMusicas(){
        LinkedList<String> musicas = new LinkedList<String>();

        musicas.add("Oasis - Supersonic");
        musicas.add("Slayer - Seasons in the Abyss");
        musicas.add("Korn - Freak on a Leash");
        musicas.add("Ducktales - Abertura");

        return musicas;
    }

    public static String escolherMusica(LinkedList<String> musicas){
        int escolha;
        for(int idx=0; idx < musicas.size(); idx++){
            IO.imprimir("" + idx + " " + musicas.get(idx));
        }

        IO.imprimir("Escolha uma música: ");
        escolha = IO.lerValorInteiro();
        return musicas.get(escolha);
    }

    public static void tocarMusicas(Queue<String> playlist){

        String musica;
        while(!playlist.isEmpty()){
            musica = playlist.poll();
            IO.imprimir("Tocando " + musica);
            for(int n=0; n < 10; n++){
                System.out.print(".");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();

        }
    }

    public static int mostrarMenu(){
        IO.imprimir("1: Inserir musica na playlist");
        IO.imprimir("2: Tocar playlist");
        IO.imprimir("0: Sair");

        return IO.lerValorInteiro();

    }

    public static void ex02(){
        //Variáveis
        Queue<String> playlist = new LinkedList<>();
        int opcao = -1;
        String musica;
        LinkedList<String> musicas = cadastrarMusicas();

        while(opcao != 0){
            opcao = mostrarMenu();

            switch (opcao) {
                case 1:
                    musica = escolherMusica(musicas);
                    playlist.add(musica);
                    break;
            
                case 2:
                    tocarMusicas(playlist);
                    break;
                default:
                    break;
            }
        }
        
        

        
    }

   
}
