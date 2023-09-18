import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Desenho extends JPanel implements ActionListener {
    private int width;
    private int height;
    private int centerX;
    private int centerY;
    private double angle = 0; // Ângulo inicial
    private double angularSpeed = 0.01; // Velocidade angular (ajuste conforme necessário)

    public Desenho(int width, int height) {
        this.width = width;
        this.height = height;
        centerX = width / 2;
        centerY = height / 2;

        // Iniciar um temporizador para atualizar a animação
        javax.swing.Timer timer = new javax.swing.Timer(10, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Atualizar o ângulo para girar a linha
        angle += angularSpeed;

        // Redesenha o componente
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Configuração para desenho suave
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Desenhar o círculo
        g2d.drawOval(centerX - width / 2, centerY - height / 2, width, height);

        // Calcular as coordenadas da linha giratória
        int x1 = centerX;
        int y1 = centerY;
        int x2 = (int) (centerX + Math.cos(angle) * width / 2);
        int y2 = (int) (centerY + Math.sin(angle) * height / 2);

        // Desenhar a linha
        g2d.drawLine(x1, y1, x2, y2);
    }
}
