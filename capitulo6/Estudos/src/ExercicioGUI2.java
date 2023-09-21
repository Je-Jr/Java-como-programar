import javax.swing.JPanel;
import java.awt.Graphics;
import java.security.SecureRandom;
import java.awt.Color;


public class ExercicioGUI2 extends JPanel{
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    SecureRandom randomNumber = new SecureRandom();

    int width = getWidth();
    int height = getHeight();

    for (int i = 1; i <= 10; i++) {
      Color color = new Color(randomNumber.nextInt(256), randomNumber.nextInt(256), randomNumber.nextInt(256));
      g.setColor(color);
      if (randomNumber.nextInt(2) == 1) {
        g.fillRect(randomNumber.nextInt(width / 2), 
        randomNumber.nextInt(height / 2), 
        randomNumber.nextInt(width / 2), 
        randomNumber.nextInt(height / 2));
      } else {
        g.fillOval(randomNumber.nextInt(width / 2), 
        randomNumber.nextInt(height / 2), 
        randomNumber.nextInt(width / 2), 
        randomNumber.nextInt(height / 2));
      }

    }
  }
}
