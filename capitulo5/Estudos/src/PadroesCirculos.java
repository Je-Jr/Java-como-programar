import java.awt.Graphics;
import javax.swing.JPanel;

public class PadroesCirculos extends JPanel {

  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    int tamanho = 20;
    int centroX = (getWidth() / 2) - (tamanho / 2);
    int centroY = (getHeight() / 2) - (tamanho / 2);


    for (int i = 0; i < 10; i++) {

          g.drawOval(centroX - i * 10, centroY - i * 10, tamanho + i * 20, tamanho + i * 20);
      
    }
  }
}