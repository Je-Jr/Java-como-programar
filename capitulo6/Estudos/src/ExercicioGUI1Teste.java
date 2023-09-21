import javax.swing.JFrame;

public class ExercicioGUI1Teste {

  public static void main(String[] args) {
    ExercicioGUI1 panel = new ExercicioGUI1();
    JFrame application = new JFrame();

    application.add(panel);
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    application.setSize(600, 600);
    application.setVisible(true);
  }

}
