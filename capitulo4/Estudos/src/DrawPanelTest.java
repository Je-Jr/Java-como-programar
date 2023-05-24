// Figura 4.19: DrawPanelTest.java
// Criando JFrame para exibir um DrawPanel.
import javax.swing.JFrame;

public class DrawPanelTest {
    public static void main(String[] args) {
        // Cria um painel que contem o desenho
        DrawPanel desenho = new DrawPanel();

        // Cria um novo quadro para armazenar o painel
        JFrame tela = new JFrame();
 
        // Configura o frame para ser encerrado quando ele é fechado
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tela.add(desenho);
        tela.setSize(500, 500);
        tela.setVisible(true);

    }
}
