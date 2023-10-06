import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestDraw extends JFrame {
  public static void main(String[] args) {
    JFrame application = new JFrame();
    DrawPanel panel = new DrawPanel();

    JLabel lblText = new JLabel(String.format("Lines: %d, Ovals: %d, Rectangles: %d",
        panel.getCountLines(),
        panel.getCountOvals(),
        panel.getCountRects()));
    lblText.setFont(Font.decode("Monserrat"));

    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    application.add(panel);
    application.add(lblText, BorderLayout.SOUTH);
    application.setSize(600, 600);
    application.setVisible(true);
  }
}
