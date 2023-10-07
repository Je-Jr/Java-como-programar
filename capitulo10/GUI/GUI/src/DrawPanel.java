import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {
  private SecureRandom randomNumber = new SecureRandom();
  private MyShape[] shapes;

  public DrawPanel(int numberOfShapes) {
    shapes = new MyShape[numberOfShapes];

    for (int i = 0; i < shapes.length; i++) {
      int x1 = randomNumber.nextInt(300);
      int y1 = randomNumber.nextInt(300);
      int x2 = randomNumber.nextInt(300);
      int y2 = randomNumber.nextInt(300);

      Color randomColor = new Color(randomNumber.nextInt(256),
          randomNumber.nextInt(256),
          randomNumber.nextInt(256));

      boolean isFilled = randomNumber.nextBoolean();
      
      int shapeType = randomNumber.nextInt(3);

      if (shapeType == 0) {
          shapes[i] = new MyLine();
      } else if (shapeType == 1) {
        shapes[i] = new MyRectangle();
        MyRectangle rect = (MyRectangle) shapes[i];
        rect.setFilled(isFilled);
      } else if (shapeType == 2) {
        shapes[i] = new MyOval();
        MyOval rect = (MyOval) shapes[i];
        rect.setFilled(isFilled);
      }
      shapes[i].setX1(x1);
      shapes[i].setY1(y1);
      shapes[i].setX2(x2);
      shapes[i].setY2(y2);
      shapes[i].setColor(randomColor);
    }
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    for (MyShape shape : shapes) {
      shape.draw(g);
    }
  }
}
