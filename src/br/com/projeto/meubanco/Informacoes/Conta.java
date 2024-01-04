package br.com.projeto.meubanco.Informacoes;

public class Conta {
    private String Titular;
    private int numeroDaConta;
    private double saldo;
    private String dadosTitular;

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDadosTitular() {
        return dadosTitular;
    }

    public void setDadosTitular(String dadosTitular) {
        this.dadosTitular = dadosTitular;
    }

    public void exibirConta(){
        System.out.println("Nome do Titular: " + getTitular());
        System.out.println("Numero da Conta: " + getNumeroDaConta());
        System.out.println("Seu saldo é: " + getSaldo());
    }
    public void inclui(Conta titular) {
        titular.exibirConta();
    }
}
