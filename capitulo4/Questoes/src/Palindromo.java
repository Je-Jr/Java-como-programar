public class Palindromo {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("Digite um numero de 5 digitos: ");
            int numero = input.nextInt();
            
            int digito1 = numero / 10000;
            int digito2 = (numero / 1000) % 10;
            int digito4 = (numero / 10) % 10;
            int digito5 = numero % 10;


            if (digito1 == digito5 && digito2 == digito4) {
                System.out.println("This is a palindrome");
                flag = false;
            } else {
                System.out.println("This is not a palindrome");
            }
        }
        input.close();
    }
}
