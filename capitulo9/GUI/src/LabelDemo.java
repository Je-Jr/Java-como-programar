import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class LabelDemo {
  public static void main(String[] args) {
    JLabel northJLabel = new JLabel("North");
    ImageIcon labelIcon = new ImageIcon("search.png");

    JLabel centerJLabel = new JLabel(labelIcon);
    JLabel southLabel = new JLabel(labelIcon);
    southLabel.setText("South");

    JFrame app = new JFrame();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    app.add(northJLabel, BorderLayout.NORTH);
    app.add(centerJLabel, BorderLayout.CENTER);
    app.add(southLabel, BorderLayout.SOUTH);

    app.setSize(300, 300);
    app.setVisible(true);

  }  
}
