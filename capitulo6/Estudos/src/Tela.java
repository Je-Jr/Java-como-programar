import javax.swing.*;

public class Tela {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Desenho Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        Desenho desenho = new Desenho(300, 300);
        
        frame.add(desenho);

        frame.setVisible(true);

    }
}
