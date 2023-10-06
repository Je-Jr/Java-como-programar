import javax.swing.JFrame;

public class TestDraw extends JFrame {
  public static void main(String[] args) {
    JFrame application = new JFrame();
    DrawPanel panel = new DrawPanel("lines");

    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    application.add(panel);
    application.setSize(600, 600);
    application.setVisible(true);
  }
}
