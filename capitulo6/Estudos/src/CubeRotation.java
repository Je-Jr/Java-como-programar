import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class CubeRotation extends JPanel implements ActionListener, KeyListener {
    private static final int WINDOW_SIZE = 800;
    private static final double ROTATE_SPEED = 0.02;

    private Timer timer;
    private List<Point3D> cubePoints;
    private double angleX, angleY, angleZ;

    public CubeRotation() {
        setPreferredSize(new Dimension(WINDOW_SIZE, WINDOW_SIZE));
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        cubePoints = new ArrayList<>();
        cubePoints.add(new Point3D(-1, -1, 1));
        cubePoints.add(new Point3D(1, -1, 1));
        cubePoints.add(new Point3D(1, 1, 1));
        cubePoints.add(new Point3D(-1, 1, 1));
        cubePoints.add(new Point3D(-1, -1, -1));
        cubePoints.add(new Point3D(1, -1, -1));
        cubePoints.add(new Point3D(1, 1, -1));
        cubePoints.add(new Point3D(-1, 1, -1));

        timer = new Timer(1000 / 60, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int scale = 100;
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        for (Point3D point : cubePoints) {
            double x = point.getX();
            double y = point.getY();
            double z = point.getZ();

            // Aplicar rotações
            double tempX = x * Math.cos(angleY) - z * Math.sin(angleY);
            double tempZ = x * Math.sin(angleY) + z * Math.cos(angleY);
            x = tempX;
            z = tempZ;

            double tempY = y * Math.cos(angleX) - z * Math.sin(angleX);
            tempZ = y * Math.sin(angleX) + z * Math.cos(angleX);
            y = tempY;
            z = tempZ;

            tempX = x * Math.cos(angleZ) - y * Math.sin(angleZ);
            tempY = x * Math.sin(angleZ) + y * Math.cos(angleZ);
            x = tempX;
            y = tempY;

            int screenX = (int) (x * scale) + centerX;
            int screenY = (int) (y * scale) + centerY;

            g2d.setColor(Color.RED);
            g2d.fillOval(screenX, screenY, 5, 5);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_A) {
            angleY += ROTATE_SPEED;
        } else if (key == KeyEvent.VK_D) {
            angleY -= ROTATE_SPEED;
        } else if (key == KeyEvent.VK_W) {
            angleX += ROTATE_SPEED;
        } else if (key == KeyEvent.VK_S) {
            angleX -= ROTATE_SPEED;
        } else if (key == KeyEvent.VK_Q) {
            angleZ -= ROTATE_SPEED;
        } else if (key == KeyEvent.VK_E) {
            angleZ += ROTATE_SPEED;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Cube Rotation Example");
            CubeRotation cubeRotation = new CubeRotation();
            frame.add(cubeRotation);
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

class Point3D {
    private double x, y, z;

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
