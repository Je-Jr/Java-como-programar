import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MyShapeTest extends JFrame{
  public static void main(String[] args) {
    String input = JOptionPane.showInputDialog("How many shapes do you want?");
    int numberOfShapes = Integer.parseInt(input);

    JFrame app = new JFrame();
    DrawPanel panel = new DrawPanel(numberOfShapes);

    JLabel lblText = new JLabel(String.format("Lines: %d, Ovals: %d, Rectangles: %d",
        MyLine.getCountLines(),
        MyOval.getCountOvals(),
        MyRectangle.getCountRects()));
    lblText.setFont(Font.decode("Monserrat"));

    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    app.add(panel);
    app.add(lblText, BorderLayout.SOUTH);
    app.setSize(600, 600);
    app.setVisible(true);
  }
}
