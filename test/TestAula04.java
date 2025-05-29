package test;

import aulas.Aula04;

public class TestAula04 {
    
    public static void main(String[] args){

        //Enable assertions
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        loader.setDefaultAssertionStatus(true);

        testEx01();
    }

    public static void testEx01(){

        //Variáveis
        //Parâmetros para os testes
        int valor_1=0, valor_2=0, saida_esperada=0, saida_obtida=0;

        //Mensagem padrão a ser mostrada caso o teste seja incorreto
        String texto_erro = "## Saída Incorreta!! ##";
        try{
            //Teste 01
            valor_1 = 5;
            valor_2 = 10;
            saida_esperada = 10;

            saida_obtida = Aula04.processarMaiorValor(valor_1, valor_2);
            assert saida_esperada == saida_obtida : texto_erro;

             //Teste 02
             valor_1 = 6;
             valor_2 = 2;
             saida_esperada = 6;
 
             saida_obtida = Aula04.processarMaiorValor(valor_1, valor_2);
             assert saida_esperada == saida_obtida : texto_erro;

             //Teste 04
             valor_1 = 8;
             valor_2 = 8;
             saida_esperada = 8;
 
             saida_obtida = Aula04.processarMaiorValor(valor_1, valor_2);
             assert saida_esperada == saida_obtida : texto_erro;

             //Teste 05
             valor_1 = 0;
             valor_2 = 4;
             saida_esperada = 4;
 
             saida_obtida = Aula04.processarMaiorValor(valor_1, valor_2);
             assert saida_esperada == saida_obtida : texto_erro;



        }catch(AssertionError error){
            //Mensagem de erro
            System.err.println(error.getMessage());

            //Mostra os valores em que o teste saiu errado
            System.err.println("valor_1: " + valor_1);
            System.err.println("valor_2: " + valor_2);
            System.err.println("saida_esperada: " + saida_esperada);
            System.err.println("saida_obtida: " + saida_obtida);
            
            System.exit(1);
        }
    }
}
