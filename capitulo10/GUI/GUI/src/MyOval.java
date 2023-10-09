import java.awt.Color;
import java.awt.Graphics;

public class MyOval extends MyBoundedShapes {
  private static int countOvals = 0;

  public MyOval() {
    this(0, 0, 0, 0, Color.BLACK, false);
  }

  public MyOval(int x1, int y1, int x2, int y2, Color color, boolean isFilled) {
    super(x1, y1, x2, y2, color, isFilled);
    countOvals = countOvals + 1;
  }
  public static int getCountOvals() {
    return countOvals;
  }

  @Override
  public void draw(Graphics g) {
    g.setColor(getColor());
    if (isFilled()) {
      g.fillOval(getX1(), getY1(), getX2(), getY2());
    }
    g.drawOval(getX1(), getY1(), getX2(), getY2());
  }
}