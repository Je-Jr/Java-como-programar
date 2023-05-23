/**
 * (Computadorização dos registros de saúde) Uma questão relacionada à assistência médica discutida ultimamente 
 * nos veículos de comunicação é a computadorização dos registros de saúde. Essa possibilidade está sendo abordada 
 * de maneira cautelosa por causa de preocupações quanto à privacidade e à segurança de dados sigilosos, entre 
 * outros motivos. [Iremos discutir essas preocupações em exercícios posteriores.] A computadorização dos registros
 * de saúde pode facilitar que pacientes compartilhem seus perfis e históricos de saúde entre vários profissionais 
 * de saúde. Isso talvez aprimore a qualidade da assistência médica, ajude a evitar conflitos e prescrições erradas 
 * de medicamentos, reduza custos em ambulatórios e salve vidas. Neste exercício, você projetará uma classe 
 * HealthProfile inicial para uma pessoa. Os atributos da classe devem incluir nome, sobrenome, sexo, data de 
 * nascimento (consistindo em atributos separados para mês, dia e ano de nascimento), altura (em metros) e peso 
 * (em quilogramas) da pessoa. Sua classe deve ter um construtor que receba esses dados. Para cada atributo, forneça 
 * métodos set e get. A classe também deve incluir métodos que calculem e retornem a idade do usuário em anos, 
 * intervalo de frequência cardíaca máxima e frequência cardíaca alvo (veja o Exercício 3.16), além de índice de 
 * massa corporal (IMC; veja o Exercício 2.33). Escreva um aplicativo Java que solicite as informações da pessoa, 
 * instancie um objeto da classe HealthProfile para ela e imprima as informações a partir desse objeto — incluindo 
 * nome, sobrenome, sexo, data de nascimento, altura e peso da pessoa ––, e então calcule e imprima a idade em anos, 
 * IMC, intervalo de frequência cardíaca máxima e frequência cardíaca alvo. Ele também deve exibir o gráfico de 
 * valores IMC do Exercício 2.33.
 */
import java.time.LocalDate;

public class HealthProfile {
    private String nome;
    private String sobrenome;
    private String sexo;
    private int dia;
    private int mes;
    private int ano;
    private double altura;
    private double peso;

    public HealthProfile(String nome, String sobrenome, String sexo, int dia, int mes, int ano, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.altura = altura;
        this.peso = peso;
    }

    // Calcular frquencia cardíaca maxima
    public int getMaximumHeartRate() {
        return 220 - getIdade();
    }

    // Calcular frequencia cardíaca alvo
    public String getTargetHeartRate() {
        int maximumHeartRate = getMaximumHeartRate();
        String targetHeartRateText = String.format("%.2f - %.2f", 
                                                   ((double) maximumHeartRate * 0.5),
                                                   ((double) maximumHeartRate * 0.85));
        return targetHeartRateText;
    }

    // Calcular IMC
    public double getIMC() {
        return peso / (altura * altura);
    }

    // Calcular idade
    public int getIdade() {
        LocalDate dataAtual = LocalDate.now();
        int idadeAnos = dataAtual.getYear() - this.ano;
        return idadeAnos;
    }

    // Getter e Setter nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    // Getter e Setter sobrenome
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    // Getter e Setter sexo
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    // Getter e Setter dia
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    // Getter e Setter mes
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    // Getter e Setter ano
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    // Getter e Setter altura
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    // Getter e Setter peso
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    
}
