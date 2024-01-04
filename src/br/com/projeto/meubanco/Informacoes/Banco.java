package br.com.projeto.meubanco.Informacoes;

public class Banco {

    public void depositar(Conta conta, double valor){
        conta.setSaldo(conta.getSaldo() + valor);
        System.out.println("Deposito de " + valor + " realizado com sucesso. ");
        System.out.println("Seu novo saldo é: " + conta.getSaldo());
    }
    public void sacar(Conta conta, double valor){
        if (valor <= conta.getSaldo()){
            double saldo = conta.getSaldo();
            saldo -= valor;
            conta.setSaldo(saldo);
            System.out.println("Saque de: " + valor + " realizado com sucesso " + " Seu novo saldo é: " + saldo);
        }else {
            System.out.println("Seu saldo é insuficiente para realização do saque");
        }
    }
    public void tranferir (Conta remetente, Conta destinatario, double valor) {
        if (valor <= remetente.getSaldo()) {
            remetente.setSaldo(remetente.getSaldo() - valor);
            destinatario.setSaldo(destinatario.getSaldo() + valor);
            System.out.println("Tranferência de " + valor + " para a conta " + destinatario.getNumeroDaConta() +  " realizada com sucesso.");
            System.out.println("Seu novo Saldo é: " + remetente.getSaldo());
        }else {
            System.out.println("Você não tem este valor para transferencia");
        }
    }

}
