import java.awt.Dimension;
import java.awt.Toolkit;
public class ResolucaoTela {
    public static void main(String[] args) {
        Dimension display = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = display.width;
        int altura = display.height;
        System.out.println("Sua tela tem a resolução " + largura + " x " + altura);
    }
    
}