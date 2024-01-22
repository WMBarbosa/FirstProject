package br.com.projeto.meubanco.Informacoes;

public class Conta implements Comparable <Conta> {
    private String Titular;
    private int numeroDaConta;
    private double saldo;

    public Conta(String titular, int numeroDaConta) {
        Titular = titular;
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitular() {
        return Titular;
    }


    public int getNumeroDaConta() {
        return numeroDaConta;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void exibirConta(){
        System.out.println("Nome do Titular: " + getTitular());
        System.out.println("Numero da Conta: " + getNumeroDaConta());
        System.out.println("Seu saldo é: " + getSaldo());
    }
    public void inclui(Conta titular) {
        titular.exibirConta();
    }

    @Override
    public String toString() {
        return "Conta: " +  this.getTitular() + " (" + this.getNumeroDaConta() + ") ";
    }

    @Override
    public int compareTo(Conta outraConta) {
        return this.getTitular().compareTo(outraConta.getTitular());
    }
}

