import javax.swing.JFrame;

public class ExercicioGUI2Teste {
  public static void main(String[] args) {
    JFrame application = new JFrame();
    ExercicioGUI2 panel = new ExercicioGUI2();

    application.add(panel);
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    application.setSize(600, 600);
    application.setVisible(true);
  }
}
