public class HealthProfileTest {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Digite seu nome e sobrenome: ");
        String nome = input.next();
        String sobrenome = input.next().trim();
        System.out.println("Qual seu sexo: masculino ou feminino");
        String sexo = input.next();
        System.out.println("Digite sua data de nascimento DIA MES ANO:");
        int dia = input.nextInt();
        int mes = input.nextInt();
        int ano = input.nextInt();
        System.out.println("Digite seu peso e sua altura:");
        double peso = input.nextDouble();
        double altura = input.nextDouble();

        
        HealthProfile paciente = new HealthProfile(nome, sobrenome, sexo, dia, mes, ano, altura, peso);
        
        exibirDados(paciente);

        input.close();
    }

    public static void exibirDados(HealthProfile paciente) {
        System.out.println("=================== DADOS DO PACIENTE ===================");
        System.out.printf("Nome: %s %s%n", paciente.getNome(), paciente.getSobrenome());
        System.out.printf("Sexo: %s%n", paciente.getSexo());
        System.out.printf("Idade: %d anos%n", paciente.getIdade());
        System.out.printf("Altura: %.3f m%n", paciente.getAltura());
        System.out.printf("Peso: %.3f Kg%n", paciente.getPeso());
        System.out.printf("IMC: %.2f%n", paciente.getIMC());
        System.out.printf("FCM: %d%n", paciente.getMaximumHeartRate());
        System.out.printf("FCA: %s%n", paciente.getTargetHeartRate());
    }
    
}
