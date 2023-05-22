public class HeartsRatesTest {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Digite o seu nome e sobrenome:");
        String nome = input.next();
        String sobrenome = input.next().trim();
        System.out.println("Digite o dia o mes e o ano de nascimento: ");
        int dia = input.nextInt();
        int mes = input.nextInt();
        int ano = input.nextInt();
        input.close();
        HeartRates pessoa1 = new HeartRates(nome, sobrenome, dia, mes, ano);

        mostrarDados(pessoa1);
    }

    public static void mostrarDados(HeartRates person) {
        System.out.println("Dados da pessoa: ");
        System.out.printf("Nome: %s%nSobrenome: %s%nIdade: %d%nFrequencia Cardiaca Maxima: %d%nFrequencia Cardiaca Alvo: %s%n",
                          person.getName(),
                          person.getLastName(),
                          person.getAge(person),
                          person.getMaximumHeartRate(person),
                          person.getTargetHeartRate(person)
                         );
    }
}
