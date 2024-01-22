package br.com.projeto.meubanco.Informacoes;

public class Investimentos extends Conta {
    private double valorInvestimento;
    private double rendimentos = 1.0;
    private int tempo = 1;

    public double getValorInvestimento() {
        return valorInvestimento;
    }

    public void setValorInvestimento(double valorInvestimento) {
        this.valorInvestimento = valorInvestimento;
    }

    public void exibirInvestimento(){
        System.out.println("O valor investido foi de: " + getValorInvestimento());
    }

    public void RendimentoAoAno(){
        double lucro = valorInvestimento * tempo * rendimentos / 100;
        valorInvestimento += lucro;
        System.out.println("Seu rendimento durante 1 mês gerou " + lucro);
        System.out.println("Seu saldo atual é: " + valorInvestimento);
        System.out.println("Seu investimento terá o redimento de " + rendimentos + "% ao mês" );
    }

    @Override
    public void inclui(Conta titular) {
        titular.exibirConta();
    }
}
