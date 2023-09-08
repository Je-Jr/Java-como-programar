public class MenorNumero {
    public static void main(String[] args) throws Exception {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Digite um numero e tecle enter:");
        int firstInt = input.nextInt();
        
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < firstInt; i++) {
            int newNumber = input.nextInt();
            if (newNumber <= smallest) {
                smallest = newNumber;
            }
        }

        System.out.printf("O menor numero digitado foi %d", smallest);

        input.close();
    }
}
