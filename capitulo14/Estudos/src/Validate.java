import java.util.Scanner;

public class Validate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o primeiro nome:");
        String firstName = scanner.nextLine();

        // System.out.println("Por favor, digite o sobrenome:");
        // String lastName = scanner.nextLine();

        // System.out.println("Por favor, digite o endereço:");
        // String address = scanner.nextLine();

        // System.out.println("Por favor, digite a cidade:");
        // String city = scanner.nextLine();

        // System.out.println("Por favor, digite o estado:");
        // String state = scanner.nextLine();

        // System.out.println("Por favor, digite o CEP:");
        // String zip = scanner.nextLine();

        System.out.println("Por favor, digite o número de telefone:");
        String phone = scanner.nextLine();

        System.out.println("%nResultado da Validação:");

        if (!ValidateInput.validateFirstName(firstName))
            System.out.println("Primeiro nome inválido");
        // else if (!ValidateInput.validateLastName(lastName))
        //     System.out.println("Sobrenome inválido");
        // else if (!ValidateInput.validateAddress(address))
        //     System.out.println("Endereço inválido");
        // else if (!ValidateInput.validateCity(city))
        //     System.out.println("Cidade inválida");
        // else if (!ValidateInput.validateState(state))
        //     System.out.println("Estado inválido");
        // else if (!ValidateInput.validateZip(zip))
        //     System.out.println("CEP inválido");
        else if (!ValidateInput.validatePhone(phone))
            System.out.println("Número de telefone inválido");
        else
            System.out.println("Entrada válida. Obrigado.");
        scanner.close();
    }
}
