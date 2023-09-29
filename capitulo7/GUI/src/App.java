import javax.swing.JFrame;

public class App extends JFrame{
    public static void main(String[] args) throws Exception {
        JFrame application = new JFrame();
        EspiralQuadrada panel = new EspiralQuadrada();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(600, 600);
        application.setVisible(true);
    }
}
