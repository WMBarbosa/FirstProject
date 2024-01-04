package br.com.projeto.meubanco.Informacoes;

public class Emprestimos extends Conta {

    private double emprestimos;
    private double taxaDeJuros = 5.0;
    private int tempoJuros = 1;


    public double getemprestimos() {
        return emprestimos;
    }

    public void setemprestimos(double valorEmprestimos) {
        this.emprestimos = valorEmprestimos;
    }


    public void exibirPedidoDeEmprestimo() {
        System.out.println("O valor requisitado de emprestimo é " + getemprestimos() + " em seguida será calculado o valor da taxa de juros sobre esse pedido");
    }

    public void jurosEmprestimos() {
        double juros = emprestimos * tempoJuros * taxaDeJuros / 100;
        emprestimos += juros;
        System.out.println("Taxa de juros: " + taxaDeJuros + "%");
        System.out.println("Juros: " + juros);
        System.out.println("Total após o juros: " + emprestimos);
    }

    @Override
    public void inclui(Conta titular) {
        titular.exibirConta();
    }
}
