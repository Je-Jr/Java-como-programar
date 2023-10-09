import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle extends MyBoundedShapes {
  private static int countRectangles = 0;

  public MyRectangle() {
    this(0, 0, 0, 0, Color.BLACK, false);
  }

  public MyRectangle(int x1, int y1, int x2, int y2, Color color, boolean isFilled) {
    super(x1, y1, x2, y2, color, isFilled);
    countRectangles = countRectangles + 1;
  }

  public static int getCountRects() {
    return countRectangles;
  }

  @Override
  public void draw(Graphics g) {
    g.setColor(getColor());
    if (isFilled()) {
      g.fillRect(getX1(), getY1(), getX2(), getY2());
    }
    g.drawRect(getX1(), getY1(), getX2(), getY2());
  }
}