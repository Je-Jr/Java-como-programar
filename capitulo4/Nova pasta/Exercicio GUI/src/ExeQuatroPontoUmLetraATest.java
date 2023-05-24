import javax.swing.JFrame;

public class ExeQuatroPontoUmLetraATest {
    public static void main(String[] args) {
        ExeQuatroPontoUmLetraA desenho = new ExeQuatroPontoUmLetraA();

        JFrame janela = new JFrame();

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        janela.add(desenho);
        janela.setSize(250, 250);
        janela.setVisible(true);
    }
}
