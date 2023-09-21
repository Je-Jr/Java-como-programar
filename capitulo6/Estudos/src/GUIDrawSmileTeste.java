import javax.swing.JFrame;

public class GUIDrawSmileTeste {
  public static void main(String[] args) {
    GUIDrawSmile panel = new GUIDrawSmile();
    JFrame application = new JFrame();

    application.add(panel);
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    application.setSize(300, 300);
    application.setVisible(true);
  }
}
