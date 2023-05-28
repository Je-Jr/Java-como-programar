public class DoisMaioresNumeros {
    public static void main(String[] args) {
        int number;
        int counter = 1;
        int largest = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;
        java.util.Scanner input = new java.util.Scanner(System.in);

        while (counter <= 10) {
            System.out.printf("Digite o total de items para o vendedor %d: ", counter);
            number = input.nextInt();
            if (number > largest) {
                segundoMaior = largest;
                largest = number;
            } else if (number > segundoMaior) {
                segundoMaior = number;
            }
            counter++;
        }

        input.close();
        System.out.printf("O maior numero foi: %d%n", largest);
        System.out.printf("O segundo maior numero foi: %d%n", segundoMaior);
    }
}

