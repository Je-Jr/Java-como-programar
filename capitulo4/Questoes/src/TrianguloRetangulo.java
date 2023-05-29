import java.util.Scanner;

public class TrianguloRetangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite os 3 numeros");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        if (n1 > 0 && n2 > 0 && n3 > 0) {
            if (n1 * n1 == n2 * n2 + n3 * n3 || n2 * n2 == n1 * n1 + n3 * n3 || n3 * n3 == n1 * n1 + n2 * n2){
                System.out.println("Os lados podem representar um triangulo retangulo");
            }else {
                System.out.println("Os valores não podem representar um triangulo retangulo");
            }
            
        }else{
            System.out.println("Os valores devem ser diferentes entre si e maiores que zero");
        }
        input.close();
    }
}