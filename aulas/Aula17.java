//Data: __/__/__
//Conteúdo: _____

package aulas;
import utils.IO;

class Pessoa{
    String nome;
    String data_nascimento;
    String email;

    public void imprimir(){
        IO.imprimir("Nome      : " + nome);
        IO.imprimir("Data Nasc.: " + data_nascimento);
        IO.imprimir("email     : " + email);
    }

    public void ler(){
        IO.imprimir("Nome: ");
        nome = IO.lerPalavra();

        IO.imprimir("Data Nascimento: ");
        data_nascimento = IO.lerPalavra();

        IO.imprimir("Email: ");
        email = IO.lerPalavra();
    }
}

public class Aula17 {

    public static void aula(){
        IO.imprimir("## Aula 17 - Registros ##");
    
        //Exercício 01
        ex01();

    }

    /**
    * Título do exercício
    * Descrição do exercício
    */
    public static void ex01(){
        //Variáveis
        Pessoa aluno = new Pessoa();
        Pessoa aluno_novo = new Pessoa();
        
        //Entrada
        //Leitura dos valores
        aluno.nome = "Zezinho";
        aluno.data_nascimento = "18/08/2000";
        aluno.email = "zezinho@gmail.com";

        // aluno_novo = lerPessoa();
        aluno_novo.ler();

        //Processamento
        //Cálculos realizados
        // processar();

        //Saída
        //Apresentação dos resultados
        
        aluno.imprimir();
        aluno_novo.imprimir();
        // imprimirPessoa(aluno_novo);
    }

    

    public static Pessoa lerPessoa(){
        Pessoa pessoa = new Pessoa();
        
        IO.imprimir("Nome: ");
        pessoa.nome = IO.lerPalavra();

        IO.imprimir("Data Nascimento: ");
        pessoa.data_nascimento = IO.lerPalavra();

        IO.imprimir("Email: ");
        pessoa.email = IO.lerPalavra();

        return pessoa;
    }

}
