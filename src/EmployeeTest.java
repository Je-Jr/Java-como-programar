public class EmployeeTest {
    public static void main(String[] args) {
        Employee motorista = new Employee("Jorge", "Junior", 1302.50);
        Employee caixa = new Employee("Regiane", "Carvalho", 1500.00);
        mostrarSalario(motorista);
        mostrarSalario(caixa);

        motorista.configurarAumento(motorista);
        caixa.configurarAumento(caixa);

        mostrarSalario(motorista);
        mostrarSalario(caixa);
    }

    static void mostrarSalario(Employee cargo) {
        System.out.println("-------------------------------------------");
        System.out.printf("%-12s %-20s %-12s %s%n", "Nome", "Sobrenome", "Valor", "Salrio Anual");
        System.out.printf("%-12s %-20s %,-12.2f %,.2f%n", 
                            cargo.getNome(), 
                            cargo.getSobrenome(), 
                            cargo.getSalarioMensal(),
                            cargo.CalcularSalarioAnual(cargo)
                            );
        System.out.println("-------------------------------------------");

    }
}
