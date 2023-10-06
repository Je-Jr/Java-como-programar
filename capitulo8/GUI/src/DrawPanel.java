import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {
  private SecureRandom randomNumber = new SecureRandom();
  private MyLine[] lines;
  private MyRectangle[] rectangles;
  private MyOval[] ovals;

  public DrawPanel() {

    setBackground(Color.CYAN);
    rectangles = new MyRectangle[1 + randomNumber.nextInt(5)];

    for (int count = 0; count < rectangles.length; count++) {
      int x1 = randomNumber.nextInt(300);
      int y1 = randomNumber.nextInt(300);
      int x2 = randomNumber.nextInt(600);
      int y2 = randomNumber.nextInt(600);

      Color color = new Color(
          randomNumber.nextInt(256),
          randomNumber.nextInt(256),
          randomNumber.nextInt(256));

      boolean isFilled = randomNumber.nextBoolean();

      rectangles[count] = new MyRectangle(x1, y1, x2, y2, color, isFilled);
    }
    ovals = new MyOval[1 + randomNumber.nextInt(5)];

    for (int count = 0; count < ovals.length; count++) {
      int x1 = randomNumber.nextInt(300);
      int y1 = randomNumber.nextInt(300);
      int x2 = randomNumber.nextInt(600);
      int y2 = randomNumber.nextInt(600);

      Color color = new Color(
          randomNumber.nextInt(256),
          randomNumber.nextInt(256),
          randomNumber.nextInt(256));

      boolean isFilled = randomNumber.nextBoolean();

      ovals[count] = new MyOval(x1, y1, x2, y2, color, isFilled);
    }

    lines = new MyLine[5 + randomNumber.nextInt(5)];

    for (int count = 0; count < lines.length; count++) {
      int x1 = randomNumber.nextInt(300);
      int y1 = randomNumber.nextInt(300);
      int x2 = randomNumber.nextInt(600);
      int y2 = randomNumber.nextInt(600);

      Color color = new Color(
          randomNumber.nextInt(256),
          randomNumber.nextInt(256),
          randomNumber.nextInt(256));

      lines[count] = new MyLine(x1, x2, y1, y2, color);

    }

  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    drawLines(g);
    drawRect(g);
    drawOval(g);
  }

  public void drawRect(Graphics g) {
    for (MyRectangle rectangle : rectangles) {
      rectangle.draw(g);
    }
  }

  public int getCountRects() {
    return rectangles.length;
  }
  
  public void drawOval(Graphics g) {
    for (MyOval oval : ovals) {
      oval.draw(g);
    }
  }
  public int getCountOvals() {
    return ovals.length;
  }
  
  public void drawLines(Graphics g) {
    for (MyLine line : lines) {
      line.draw(g);
    }
  }
  public int getCountLines() {
    return lines.length;
  }

}
