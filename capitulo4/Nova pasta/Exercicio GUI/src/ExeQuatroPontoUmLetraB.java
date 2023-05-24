import java.awt.Graphics;
import javax.swing.JPanel;

public class ExeQuatroPontoUmLetraB extends JPanel{
    private final int NUMERO_PASSOS = 15;
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width_tela = getWidth();
        int height_tela = getHeight();

        int mudanca_X = width_tela / NUMERO_PASSOS;
        int mudanca_Y = height_tela / NUMERO_PASSOS;
        
        for (int i = 0; i < NUMERO_PASSOS; i++) {
            int cantoSuperiorEsquerdoX = 0;
            int cantoSuperiorEsquerdoY = 0;
            int fimDaLinhaX = i * mudanca_X;
            int fimDaLinhaY = (NUMERO_PASSOS - i) * mudanca_Y;

            g.drawLine(cantoSuperiorEsquerdoX, cantoSuperiorEsquerdoY, fimDaLinhaX, fimDaLinhaY);
        }
        for (int j = 0; j < NUMERO_PASSOS; j++) {
            int cantoInferiorDireitoX = width_tela;
            int cantoInferiorDireitoY = height_tela;
            int fimDaLinhaX = j * mudanca_X;
            int fimDaLinhaY = (NUMERO_PASSOS - j) * mudanca_Y;

            g.drawLine(cantoInferiorDireitoX, cantoInferiorDireitoY, fimDaLinhaX, fimDaLinhaY);
            
        }
        for (int k = 0; k < NUMERO_PASSOS; k++) {
            int cantoInferiorEsquerdoX = 0;
            int cantoInferiorEsquerdoY = height_tela;
            int fimDaLinhaX = width_tela - (k * mudanca_X);
            int fimDaLinhaY = (NUMERO_PASSOS - k) * mudanca_Y;

            g.drawLine(cantoInferiorEsquerdoX, cantoInferiorEsquerdoY, fimDaLinhaX, fimDaLinhaY);
            
        }
        for (int l = 0; l < NUMERO_PASSOS; l++) {
            int cantoSuperiorDireitoX = width_tela;
            int cantoSuperiorDireitoY = 0;
            int fimDaLinhaX = width_tela - (l * mudanca_X);
            int fimDaLinhaY = (NUMERO_PASSOS - l) * mudanca_Y;

            g.drawLine(cantoSuperiorDireitoX, cantoSuperiorDireitoY, fimDaLinhaX, fimDaLinhaY);
            
        }
    }
}