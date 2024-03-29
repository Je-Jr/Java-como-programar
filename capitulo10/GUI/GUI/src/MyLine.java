import java.awt.Color;
import java.awt.Graphics;

public class MyLine extends MyShape{
  private static int countLines = 0;

  public MyLine(){
    this(0, 0, 0, 0, Color.BLACK);
  }

  public MyLine(int x1, int y1, int x2, int y2, Color color) {
    super(x1, y1, x2, y2, color);
    countLines = countLines + 1;
  }

  public static int getCountLines() {
    return countLines;
  }

  @Override
  public void draw(Graphics g) {
    g.setColor(getColor());
    g.drawLine(getX1(), getY1(), getX2(), getY2());
  }
  
}
