import javax.swing.JFrame;

public class ExeQuatroPontoUmLetraBTest {
    public static void main(String[] args) {
        ExeQuatroPontoUmLetraB desenho = new ExeQuatroPontoUmLetraB();

        JFrame janela = new JFrame();

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        janela.add(desenho);
        janela.setSize(400, 400);
        janela.setVisible(true);
    }
}