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

        itau.sacar(contaLeo, 100);

        System.out.println();

        Conta contaWesley = new Conta();
        contaWesley.setTitular("Wesley");
        contaWesley.setNumeroDaConta(36798);
        contaWesley.setSaldo(100);
        contaWesley.exibirConta();

        itau.depositar(contaWesley, 50D);
        contaWesley.exibirConta();

        itau.tranferir(contaWesley, contaLeo, 200);

        System.out.println();

        List<Conta> listaDeContas = new ArrayList<>();
        listaDeContas.add(contaWesley);
        listaDeContas.add(contaLeo);
        System.out.println(listaDeContas);

        System.out.println();

        Collections.sort(listaDeContas);
        System.out.println("Contas Ordenadas");
        System.out.println(listaDeContas);

        System.out.println();

        listaDeContas.sort(Comparator.comparing(Conta::getNumeroDaConta));
        System.out.println("Ordenados por numero");
        System.out.println(listaDeContas);

    }
}
