/**
 * (Classe Employee) Crie uma classe chamada Employee que inclua três variáveis de instância — um primeiro 
 * nome (tipo String), um sobrenome (tipo String) e um salário mensal (double). Forneça um construtor que 
 * inicializa as três variáveis de instância. Forneça um método set e um get para cada variável de instância. 
 * Se o salário mensal não for positivo, não configure seu valor. Escreva um aplicativo de teste chamado 
 * EmployeeTest que demonstre as capacidades da classe Employee. Crie dois objetos Employee e exiba o salário 
 * anual de cada objeto. Então dê a cada Employee um aumento de 10% e exiba novamente o salário anual de cada 
 * Employee.
 */

public class Employee {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    // Construtor
    public Employee(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = (salarioMensal > 0) ? salarioMensal : 0.0;
    }

    // Configurar aumento
    public void configurarAumento(Employee cargo){
        this.salarioMensal = cargo.salarioMensal + (cargo.salarioMensal * 0.1);
    }

    // Salario anual
    public double CalcularSalarioAnual(Employee cargo) {
        return 12 * this.salarioMensal;
    }

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    // Getter e Setter para sobrenome
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }


    // Getter e Setter para salario mensal
    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
