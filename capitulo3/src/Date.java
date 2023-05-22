/**
 * (Classe Date) Crie uma classe chamada Date que inclua três variáveis de instância — mês (tipo int), 
 * dia (tipo int) e ano (tipo int). Forneça um construtor que inicializa as três variáveis de instância 
 * supondo que os valores fornecidos estejam corretos. Ofereça um método set e um get para cada variável 
 * de instância. Apresente um método displayDate que exiba mês, dia e ano separados por barras normais (/). 
 * Escreva um aplicativo de teste chamado DateTest que demonstre as capacidades da classe Date.
 */

public class Date {
    private int mes;
    private int dia;
    private int ano;
    

    public Date(int mes, int dia, int ano) {
        this.mes = (mes > 0) ? mes : 0;
        this.dia = (dia > 0) ? dia : 0;
        this.ano = (ano > 0) ? ano : 0;
    }

    // Mostrar data
    public String displayDate(Date data) {
        String dataFormatada = String.format("%02d/%02d/%d", data.mes, data.dia, data.ano);
        return dataFormatada;
    }

    // Getter e Setter mes
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12)
            this.mes = mes;
        else
            this.mes = 0;
    }

    // Getter e Setter dia
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        if (dia > 0 && dia <= 31)
            this.dia = dia;
        else
            this.dia = 0;
    }

    // Getter e Setter ano
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        if (ano > 1000 && ano <= 2999)
            this.ano = ano;
        else    
            this.ano = 0;
    }
    
}
