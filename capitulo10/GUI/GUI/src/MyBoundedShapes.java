import java.awt.Color;

public abstract class MyBoundedShapes extends MyShape {
  private boolean isFilled;

  public MyBoundedShapes(int x1, int y1, int x2, int y2, Color color, boolean isFilled) {
    super(x1, y1, x2, y2, color);
    this.isFilled = isFilled;
  }

  public MyBoundedShapes(boolean isFilled) {
    this.isFilled = isFilled;
  }

  public boolean isFilled() {
    return isFilled;
  }

  public void setFilled(boolean isFilled) {
    this.isFilled = isFilled;
  }
}
