import java.util.Scanner;

public class Validate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o primeiro nome:");
        String firstName = scanner.nextLine();

        // System.out.println("Por favor, digite o sobrenome:");
        // String lastName = scanner.nextLine();

        // System.out.println("Por favor, digite o endere�o:");
        // String address = scanner.nextLine();

        // System.out.println("Por favor, digite a cidade:");
        // String city = scanner.nextLine();

        // System.out.println("Por favor, digite o estado:");
        // String state = scanner.nextLine();

        // System.out.println("Por favor, digite o CEP:");
        // String zip = scanner.nextLine();

        System.out.println("Por favor, digite o n�mero de telefone:");
        String phone = scanner.nextLine();

        System.out.println("%nResultado da Valida��o:");

        if (!ValidateInput.validateFirstName(firstName))
            System.out.println("Primeiro nome inv�lido");
        // else if (!ValidateInput.validateLastName(lastName))
        //     System.out.println("Sobrenome inv�lido");
        // else if (!ValidateInput.validateAddress(address))
        //     System.out.println("Endere�o inv�lido");
        // else if (!ValidateInput.validateCity(city))
        //     System.out.println("Cidade inv�lida");
        // else if (!ValidateInput.validateState(state))
        //     System.out.println("Estado inv�lido");
        // else if (!ValidateInput.validateZip(zip))
        //     System.out.println("CEP inv�lido");
        else if (!ValidateInput.validatePhone(phone))
            System.out.println("N�mero de telefone inv�lido");
        else
            System.out.println("Entrada v�lida. Obrigado.");
        scanner.close();
    }
}
