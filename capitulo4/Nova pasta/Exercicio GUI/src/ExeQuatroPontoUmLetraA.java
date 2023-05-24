import java.awt.Graphics;
import javax.swing.JPanel;

public class ExeQuatroPontoUmLetraA extends JPanel{
    private final int NUMERO_PASSOS = 15;
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width_tela = getWidth();
        int height_tela = getHeight();

        int stepX = width_tela / NUMERO_PASSOS;
        int stepY = height_tela / NUMERO_PASSOS;
        System.out.println(stepY);
        
        for (int i = 0; i < NUMERO_PASSOS; i++) {
            int startX = 0;
            int startY = 0;
            int endX = i * stepX;
            int endY = (NUMERO_PASSOS - i) * stepY;

            g.drawLine(startX, startY, endX, endY);
        }
    }
}