import javax.swing.JFrame;

public class PadroesCirculosTest {
  public static void main(String[] args) {

    PadroesCirculos panel = new PadroesCirculos();

    JFrame application = new JFrame();

    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    application.add(panel);
    application.setSize(300, 300);
    application.setVisible(true);
  }
}