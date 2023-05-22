import javax.swing.JOptionPane;

public class SumGUI {
    public static void main(String[] args) {
        int num1, num2, sum;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro inteiro: "));

        sum = num1 + num2;

        String message = String.format("%d + %d = %d", num1, num2, sum);

        JOptionPane.showMessageDialog(null, message);
    }
}
