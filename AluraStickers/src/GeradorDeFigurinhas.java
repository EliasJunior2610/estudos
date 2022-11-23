
//Importações
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;

public class GeradorDeFigurinhas {
    public void cria() throws Exception {
        // Leitura da Imagem
        InputStream inputStream = new FileInputStream(new File("entrada/filme.jpg"));
        BufferedImage imagemOriginal = ImageIO.read(inputStream);

        // Cria Nova Imagem Em Memória Com Transparência e Com Tamanho Novo
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        // Copiar a Imagem Original Pra Nova Imagem (Em Memória)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);

        // Configurar a Fonte
        var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 64);
        graphics.setColor(Color.YELLOW);
        graphics.setFont(fonte);
        // Escrever uma Frase na Nova Imagem
        graphics.drawString("Topzera", 100, novaAltura - 100);
        // Escrever a Imagem em um Arquivo
        ImageIO.write(novaImagem, "png", new File("saída/figurinha.png"));
    }

    public static void main(String[] args) throws Exception {
        var geradora = new GeradorDeFigurinhas();
        geradora.cria();
    }
}
