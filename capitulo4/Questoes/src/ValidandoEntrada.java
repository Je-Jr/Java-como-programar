import java.util.Scanner;

public class ValidandoEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = 0;
        while (n != 1 && n != 2) {
            System.out.println("Digite um valor diferente de 1 ou 2:");
            n = scanner.nextInt();
        }
        System.out.println("n = " + n);
        scanner.close();
    }
}
