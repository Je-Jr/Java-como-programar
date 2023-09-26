public class TaxaEstacionamento {
    int horas;
    double valor;
    TaxaEstacionamento(int horas){
        this.horas = horas;
        this.valor = 2.0;
    }

    public double calculateCharges(){
        if (this.horas > 2) {
            return this.horas * this.valor;
        } else {
            return this.valor;
        }
    }

}
