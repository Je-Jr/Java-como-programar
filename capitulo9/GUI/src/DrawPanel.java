import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {
  private SecureRandom randomNumber = new SecureRandom();
  private MyLine[] lines;
  private MyRectangle[] rectangles;
  private String form;

  public DrawPanel(String form) {
    this.form = form;
    setBackground(Color.CYAN);

    if (form == "rect") {
      rectangles = new MyRectangle[1 + randomNumber.nextInt(5)];

      for (int count = 0; count < rectangles.length; count++) {
        int x1 = randomNumber.nextInt(600);
        int y1 = randomNumber.nextInt(600);
        int x2 = randomNumber.nextInt(600);
        int y2 = randomNumber.nextInt(600);

        Color color = new Color(
            randomNumber.nextInt(256),
            randomNumber.nextInt(256),
            randomNumber.nextInt(256));

        boolean isFilled = randomNumber.nextBoolean();

        rectangles[count] = new MyRectangle(x1, y1, x2, y2, color, isFilled);
      }

    }
    if (form == "lines") {
      lines = new MyLine[5 + randomNumber.nextInt(5)];

      for (int count = 0; count < lines.length; count++) {
        int x1 = randomNumber.nextInt(600);
        int y1 = randomNumber.nextInt(600);
        int x2 = randomNumber.nextInt(600);
        int y2 = randomNumber.nextInt(600);

        Color color = new Color(
            randomNumber.nextInt(256),
            randomNumber.nextInt(256),
            randomNumber.nextInt(256));

        lines[count] = new MyLine(x1, x2, y1, y2, color);

      }
    }

  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    if(form.equals("lines")) {
      drawLines(g);
    }
    if(form.equals("rect")) {
      drawRect(g);
    }
  }

  public void drawRect(Graphics g) {
    for (MyRectangle rectangle : rectangles) {
      rectangle.draw(g);
    }
  }

  public void drawLines(Graphics g) {
    for (MyLine line : lines) {
      line.draw(g);
    }
  }

}
