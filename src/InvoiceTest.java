public class InvoiceTest {
    public static void main(String[] args) {
        Invoice teclado = new Invoice("123456", "Teclado Mecanico", 2, 45.50);
        Invoice mouse = new Invoice("123123", "Mouse Gamer", 6, 0.0);

        imprimirCupomFiscal(mouse);
        imprimirCupomFiscal(teclado);
        
    }

    public static void imprimirCupomFiscal(Invoice produto) {
        System.out.println("========================================================");
        System.out.printf("%-10s %-20s %-15s %-5s%n", "Numero", "Desc", "Valor Unitario", "Qtde");
        System.out.printf("%-10s %-20s %-15.2f %-5d%n", 
                           produto.getNumeroDaFatura(), 
                           produto.getDescricaoCompra(), 
                           produto.getPrecoItem(), 
                           produto.getQuantidadeItemComprada()
                         );
        System.out.println("========================================================");
    }
    

    public static void mostrarItens(Invoice produto) {
        System.out.println("=============================");
        System.out.printf("%-20s %s%n", "Numero da compra:", produto.getNumeroDaFatura());
        System.out.printf("%-20s %s%n", "Descricao:", produto.getDescricaoCompra());
        System.out.printf("%-20s %d%n", "Quantidade:", produto.getQuantidadeItemComprada());
        System.out.printf("%-20s %.2f%n", "Valor unitario:", produto.getPrecoItem());
        System.out.printf("%-20s R$%.2f%n", "Valor total:", produto.getInvoiceAmount(produto));
        System.out.println("=============================");

    }
}
