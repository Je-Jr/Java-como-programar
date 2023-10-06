import java.awt.Graphics;
import java.awt.Color;

public class MyOval {
  private int x1;
  private int y1;
  private int x2;
  private int y2;
  private Color color;
  private boolean isFilled;

  public MyOval(int x1, int y1, int x2, int y2, Color color, boolean isFilled) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    this.color = color;
    this.isFilled = isFilled;
  }

  public void draw(Graphics g) {
    g.setColor(color);
    if (isFilled) {
      g.fillOval(x1, y1, x2, y2);
    } else {
      g.drawOval(x1, y1, x2, y2);
    }

  }
}
