package br.com.projeto.meubanco.principal;

import br.com.projeto.meubanco.Informacoes.Banco;
import br.com.projeto.meubanco.Informacoes.Conta;
import br.com.projeto.meubanco.Informacoes.Emprestimos;
import br.com.projeto.meubanco.Informacoes.Investimentos;

public class Principal {

    public static void main(String[] args) {

        Banco itau = new Banco();

        Conta contaLeo = new Conta();
        contaLeo.setTitular("Leonardo");
        contaLeo.setNumeroDaConta(67589);
        contaLeo.setSaldo(100);
        contaLeo.exibirConta();

        itau.depositar(contaLeo, 30D);
        contaLeo.exibirConta();


        System.out.println();

        Conta contaWesley = new Conta();
        contaWesley.setTitular("Wesley");
        contaWesley.setNumeroDaConta(36798);
        contaWesley.setSaldo(100);
        contaWesley.exibirConta();

        itau.depositar(contaWesley, 50D);
        contaWesley.exibirConta();

        System.out.println();

        Emprestimos emprestimo1 = new Emprestimos();
        emprestimo1.inclui(contaLeo);
        emprestimo1.setemprestimos(5000);
        emprestimo1.exibirPedidoDeEmprestimo();
        emprestimo1.jurosEmprestimos();

        System.out.println();

        Investimentos investimento = new Investimentos();
        investimento.inclui(contaWesley);
        investimento.setValorInvestimento(5000);
        investimento.exibirInvestimento();
        investimento.getRendimentos();
        investimento.setRendimentoAoAno();

    }
}
