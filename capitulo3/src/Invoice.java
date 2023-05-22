public class Invoice {
    private String numeroDaFatura;
    private String descricaoCompra;
    private int quantidadeItemComprada;
    private double precoItem;

    // Construtor
    public Invoice(String numero, String descricao, int quantidade, double preco) {
        this.numeroDaFatura = numero;
        this.descricaoCompra = descricao;
        this.quantidadeItemComprada = (quantidade > 0) ? quantidade : 0;
        this.precoItem = (preco > 0) ? preco : 0.0;
    }

    // Método getInvoiceAmount: calcular valor fatura
    public double getInvoiceAmount(Invoice fatura) {
        return fatura.quantidadeItemComprada * fatura.precoItem;
    }


    // Getter e Setter descricaoCompra
    public String getDescricaoCompra() {
        return descricaoCompra;
    }
    public void setDescricaoCompra(String descricaoCompra) {
        this.descricaoCompra = descricaoCompra;
    }

    // Getter e Setter quantidadeComprada
    public int getQuantidadeItemComprada() {
        return quantidadeItemComprada;
    }
    public void setQuantidadeItemComprada(int quantidadeItemComprada) {
        this.quantidadeItemComprada = quantidadeItemComprada;
    }

    // Getter e Setter precoItem
    public double getPrecoItem() {
        return precoItem;
    }
    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    // Getter e Setter numeroFatura
    public String getNumeroDaFatura() {
        return numeroDaFatura;
    }
    public void setNumeroDaFatura(String numeroDaFatura) {
        this.numeroDaFatura = numeroDaFatura;
    }
    
}
