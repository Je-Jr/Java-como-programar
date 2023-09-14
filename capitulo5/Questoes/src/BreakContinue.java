import java.util.Scanner;


/**
 * codigo gerado pelo chatGPT para que o desenvolvedor possa substituir a instrução break
 */
public class BreakContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro não negativo: ");
        int numero = scanner.nextInt();
        scanner.close();

        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;

            // Verifica se o fatorial já ultrapassou o limite do tipo de dados (estouro)
            if (fatorial < 0) {
                System.out.println("O fatorial ultrapassou o limite do tipo de dados.");
                // break;
                i = numero; // Substituto de break para esse caso
            }
        }

        if (fatorial >= 0) {
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }
}

