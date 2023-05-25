/*
(Calculador de limite de crédito) Desenvolva um aplicativo Java que determina se um cliente de uma loja de 
departamentos excedeu o limite de crédito em uma conta-corrente. Para cada cliente, os seguintes dados estão 
disponíveis:
a) Número de conta.
b) Saldo no início do mês.
c) Total de todos os itens cobrados desse cliente no mês.
d) Total de créditos aplicados ao cliente no mês.
e) Limite de crédito autorizado.
O programa deve inserir todos esses dados como inteiros, calcular o novo saldo (= saldo inicial + despesas – créditos), 
exibir o novo saldo e determinar se o novo saldo excede ao limite de crédito do cliente. Para aqueles clientes cujo 
limite de crédito foi excedido, o programa deve exibir a mensagem "Limite de crédito excedido". 

top-down stepwise:

1 refinamento:
Desenvolver um programa que determine se o limite de credito foi excedido;

2 refinamento:
Inicializar as variaveis e objetos;
Requisitar os dados ao usuario;
Realizar os calculos;

3 refinamento:
Inicializar numero da conta;
Inicializar saldo inicial;
Inicializar total de itens cobrados no mes;
Inicializar total de créditos aplicados ao cliente no mes;
Inicializar total de crédito autorizado;
Inicializar objeto Scanner
Inicializar objeto Cliente;

Requisitar numero da conta;
Requisitar total de itens cobrados no mes;
Requisitar total de creditos aplicados ao cliente;
Requisitar total de credito autorizado;

calcular o novo saldo;
verificar se o novo saldo excede o limite;
se sim, exibir mensagem;


*/

public class Cliente {
    String numeroConta;
    int saldoInicial;
    int totalItensMes;
    int totalCreditoMes;
    int creditoAutorizado;

    public Cliente(String numeroConta, int saldoInicial, int totalItensMes, int totalCreditoMes, int creditoAutorizado) {
        this.numeroConta = numeroConta;
        this.saldoInicial = saldoInicial;
        this.totalItensMes = totalItensMes;
        this.totalCreditoMes = totalCreditoMes;
        this.creditoAutorizado = creditoAutorizado;
    }

    public void exibirDados() {
        System.out.printf("Numero da conta: %s%n", this.numeroConta);
        System.out.printf("Saldo inicial: %d%n", this.saldoInicial);
        System.out.printf("Valor de itens comprados: %d%n", this.totalItensMes);
        System.out.printf("Total de credito utilizado: %d%n", this.totalCreditoMes);
        System.out.printf("Valor do limite de credito: %d%n", this.creditoAutorizado);
        System.out.printf("Novo saldo: %s%n", (creditoAutorizado < calcularSaldo()) ? calcularSaldo() : "Credito excedido");
    }

    public int calcularSaldo() {
        return this.saldoInicial + this.totalItensMes - this.totalCreditoMes;
    }
}
