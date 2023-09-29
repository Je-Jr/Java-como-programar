import java.awt.Graphics;
import javax.swing.JPanel;


public class EspiralCircular extends JPanel {

  
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int posX = getWidth() / 2;
    int posY = posX;
    int width = posX / 30;
    int height = width;
    int arcStart = 0;
    final int ARC_LENGTH = 180;

    int increment = width;
    int angleIncrement = 180;

    for (int i = 1; i < 100; i++) {
      g.drawArc(posX, posY, width, height, arcStart, ARC_LENGTH);
      posX -= increment;
      posY -= (int) increment / 2;
      width += increment;
      height += increment;
      arcStart += angleIncrement;
      g.drawArc(posX, posY, width, height, arcStart, ARC_LENGTH);
      posY -= (int) increment / 2;
      width += increment;
      height += increment;
      arcStart += angleIncrement;

      // g.drawArc(300, 300, 50, 50, 0, 180);
      // //        -50  -25 +50 +50 +180
      // g.drawArc(250, 275, 100, 100, 180, 180);
      // //         +0  -25  +50  +50 +180
      // g.drawArc(250, 250, 150, 150, 360, 180);
      // //        -50  -25  +50  +50 +180
      // g.drawArc(200, 225, 200, 200, 540, 180);
      // //         +0  -25  +50  +50 +180
      // g.drawArc(200, 200, 250, 250, 720, 180);
      // //        -50  -25  +50  +50  +180
      // g.drawArc(150, 175, 300, 300, 900, 180);
    }

  }
}
