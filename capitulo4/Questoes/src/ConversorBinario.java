public class ConversorBinario {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Digite um binario");
        int numero = input.nextInt(); 
        int fator = 10;
        int fatorConversor = 2;
        int count = 0;
        int digito;
        int numeroConvertido = 0;
        while (count < numberLength(numero)) {
            if (count == 0) {
                digito = (numero / 1) % 10;
            } else {
                digito = (numero / fator) % 10;
                fator *= 10;
            }
            
            if (count == 0) {
                numeroConvertido = digito * 1;
            } else {
                numeroConvertido = numeroConvertido + (digito * fatorConversor);
                fatorConversor = fatorConversor * 2;
            }
            count++;
            
            
        }
        System.out.println("Numero convertido " + numeroConvertido);
        System.out.println();
        
        input.close();
    }

    public static int numberLength(int number) {
        int length = 0;
        while (number != 0) {
            number = number / 10;
            length++;
        }
        return length;
    }
}
