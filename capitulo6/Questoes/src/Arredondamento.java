import java.util.Scanner;

public class Arredondamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        double numero = 0.0;
        while(flag){
            System.out.println("Digite um numero de ponto flutuante:");
            numero = input.nextDouble();
            if (numero == 0) {
                break;
            }
            int resultado = (int) Math.floor(numero + 0.5);
            System.out.printf("Numero: %f Resultado: %d%n", numero, resultado);
        }
        input.close();
    }
}
