/**
 * (Calculadora de frequência cardíaca alvo) Ao fazer exercícios físicos, você pode utilizar um monitor de frequência 
 * cardíaca para ver se sua frequência permanece dentro de um intervalo seguro sugerido pelos seus treinadores e 
 * médicos. Segundo a American Heart Association (AHA) (www.americanheart.org/presenter.jhtml?identifier=4736), a 
 * fórmula para calcular a frequência cardíaca máxima por minuto é 220 menos a idade em anos. Sua frequência cardíaca 
 * alvo é um intervalo entre 50-85% da sua frequência cardíaca máxima. [Observação: essas fórmulas são estimativas 
 * fornecidas pela AHA. As frequências cardíacas máximas e alvo podem variar com base na saúde, capacidade física e 
 * sexo da pessoa. Sempre consulte um médico ou profissional de saúde qualificado antes de começar ou modificar um 
 * programa de exercícios físicos.] Crie uma classe chamada HeartRates. Os atributos da classe devem incluir o nome, 
 * sobrenome e data de nascimento da pessoa (consistindo em atributos separados para mês, dia e ano de nascimento). 
 * Sua classe deve ter um construtor que receba esses dados como parâmetros. Para cada atributo forneça métodos set e 
 * get. A classe também deve incluir um método que calcule e retorne a idade (em anos), um que calcule e retorne a 
 * frequência cardíaca máxima e um que calcule e retorne a frequência cardíaca alvo da pessoa. Escreva um aplicativo 
 * Java que solicite as informações da pessoa, instancie um objeto da classe HeartRates e imprima as informações a 
 * partir desse objeto — incluindo nome, sobrenome e data de nascimento da pessoa — calcule e imprima a idade da 
 * pessoa (em anos), seu intervalo de frequência cardíaca máxima e sua frequência cardíaca alvo.
 */

public class HeartRates {
    private String name;
    private String lastName;
    private int DayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;

    public HeartRates(String name, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.DayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public int getAge(HeartRates person) {
        return 2023 - yearOfBirth;
    }

    public int getMaximumHeartRate(HeartRates person) {
        return 220 - getAge(person);
    }

    public String getTargetHeartRate(HeartRates person) {
        int maximumHeartRate = getMaximumHeartRate(person);
        String targetHeartRateText = String.format("%.2f - %.2f", 
                                                   ((double) maximumHeartRate * 0.5),
                                                   ((double) maximumHeartRate * 0.85));
        return targetHeartRateText;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getDayOfBirth() {
        return DayOfBirth;
    }
    public void setDayOfBirth(int dayOfBirth) {
        DayOfBirth = dayOfBirth;
    }
    public int getMonthOfBirth() {
        return monthOfBirth;
    }
    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    
}
