import java.util.Scanner;

public class GraficoDeBarras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite cinco numeros entre 1 e 30 separando-os com espacos:");
        for (int i = 1; i <= 5; i++) {
            int numero;
            numero = scanner.nextInt();
            for (int j = 0; j <= numero; j++) {
              System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
