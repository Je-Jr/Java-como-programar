import java.awt.Graphics;
import javax.swing.JPanel;

public class EspiralQuadrada extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);


    int x1 = 300;
    int y1 = 300;
    int x2 = 300;
    int y2 = 300;

    int factor = 5;

    for (int l = 1; l < 100; l++) {
      y2 = y2 - (l * factor);
      g.drawLine(x1, y1, x2, y2);
      x1 = x2;
      y1 = y2;
      factor *= -1;
      x2 = x2 - (l * factor);
      g.drawLine(x1, y1, x2, y2);
      x1 = x2;
      y1 = y2;
      

      /**
       * Explicação da lógica do algoritmo
       */
      // // 50
      // g.drawLine(300, 300, 300, 250);
      // g.drawLine(300, 250, 350, 250);

      // // 100
      // g.drawLine(350, 250, 350, 350);
      // g.drawLine(350, 350, 250, 350);

      // // 150
      // g.drawLine(250, 350, 250, 200);
      // g.drawLine(250, 200, 400, 200);

      // // 200
      // g.drawLine(400, 200, 400, 400);
      // g.drawLine(400, 400, 200, 400);

      // // 250
      // g.drawLine(200, 400, 200, 150);
      // g.drawLine(200, 150, 450, 150);

      // // 300
      // g.drawLine(450, 150, 450, 450);
      // g.drawLine(450, 450, 150, 450);

    }
  }
}
