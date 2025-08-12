package aulas;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import utils.ImagePixels;
import utils.Pixel;

public class Imagem {

    public static void aula() {
        System.out.println("Aula de Matrizes - Manipulação de Imagens Pixel a Pixel");

        //Modifica uma imagem
        modificarImagemTeste("imagem_entrada.png", "imagem_saida.png");
    }

    public static void modificarImagemTeste(String nome_imagem_entrada, String nome_imagem_saida){

        try {
            // Carrega o arquivo com a imagem
            BufferedImage img = ImageIO.read(new File(nome_imagem_entrada));
            BufferedImage img2 = ImageIO.read(new File(nome_imagem_entrada));

            // Mapeia o arquivo para acessá-lo pixel a pixel
            ImagePixels ip = new ImagePixels(img);
            ImagePixels ip2 = new ImagePixels(img2);

            // Obtém altura e largura da imagem
            int altura  = ImagePixels.getAltura();
            int largura = ImagePixels.getLargura();

            System.out.println("Tamanho da imagem:");
            System.out.println("\tAltura : " + altura);
            System.out.println("\tLargura: " + largura);

            // Exemplo de uso. Carrega o pixel na posição x=10, y=10
            // p é o pixel
            for( int x=0; x < largura; x++){
                for(int y=0; y < altura; y++){
                    Pixel p  = ip.pixel(x, y);
                    Pixel p2 = ip2.pixel(largura - x -1, y);
                    
                    p.setRed( p2.getRed() );
                    p.setGreen( p2.getGreen() );
                    p.setBlue( p2.getBlue() );
                    
                }
            }
            
            ImageIO.write(img, "png", new File(nome_imagem_saida));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}