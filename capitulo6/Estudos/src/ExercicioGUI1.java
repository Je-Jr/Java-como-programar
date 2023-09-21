import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class ExercicioGUI1 extends JPanel{
  SecureRandom randomNumbers = new SecureRandom();

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.setColor(new Color(randomNumbers.nextInt(255), randomNumbers.nextInt(255), randomNumbers.nextInt(255)));
    g.fillOval(100, 100, 300, 300);

    g.setColor(new Color(randomNumbers.nextInt(255), randomNumbers.nextInt(255), randomNumbers.nextInt(255)));
    g.fillOval(125, 125, 250, 250);

    g.setColor(new Color(randomNumbers.nextInt(255), randomNumbers.nextInt(255), randomNumbers.nextInt(255)));
    g.fillOval(150, 150, 200, 200);

    g.setColor(new Color(randomNumbers.nextInt(255), randomNumbers.nextInt(255), randomNumbers.nextInt(255)));
    g.fillOval(175, 175, 150, 150);

    g.setColor(new Color(randomNumbers.nextInt(255), randomNumbers.nextInt(255), randomNumbers.nextInt(255)));
    g.fillOval(200, 200, 100, 100);

    g.setColor(new Color(randomNumbers.nextInt(255), randomNumbers.nextInt(255), randomNumbers.nextInt(255)));
    g.fillOval(225, 225, 50, 50);
  }
  
}
