import java.util.Date;
public class Main {
    public static void main(String[] args) {
        System.out.println("Rodando o programa...");
        cartaoFactory();
        emprestimoFactory();
        usuarioFactory();
        clientePessoaFisicaFactory();
        clientePessoaJuridicaFactory();
        transacaoFactory();
        contaBancariaFactory();
        contaCorrenteFactory();
        contaPoupancaFactory();
        investimentoFactory();
    }

    private static void cartaoFactory() {
        Cartao cartao = new Cartao("Visa", new Date(), 1234, "Fulano da Silva", 1234567890, "Crédito", true, 1000);
        System.out.print(cartao.toString());
    }

    private static void emprestimoFactory() {
        Emprestimo emprestimo = new Emprestimo(1000.0, 100.0, "10%", 10, 0, new Date());
        System.out.print(emprestimo.toString());
    }

    private static void usuarioFactory() {
        Usuario usuario = new Usuario("Fulano da Silva", "fulano@email.com", "40028922", "Programador", "", 
            new Date(), 1000.0, new Endereco("12341235", "Rua dos bobos", "Bairro", "Cidade", "Estado"), 
            new Emprestimo(1000.0, 100.0, "10%", 10, 0, new Date()), false);

        System.out.print(usuario.toString());
    }

    private static void clientePessoaFisicaFactory() {
        ClientePessoaFisica usuario = new ClientePessoaFisica("321321412312", "423425234523", "Fulano da silva", "fulano@email.com", "40020321391", 
            null, null, new Date(), 1000.0, new Endereco("12341235", "Rua dos bobos", "Bairro", "Cidade", "Estado"), 
            new Emprestimo(1000.0, 100.0, "10%", 10, 0, new Date()), false);

        System.out.print(usuario.toString());
    }

    private static void clientePessoaJuridicaFactory() {
        ClientePessoaJuridica usuario = new ClientePessoaJuridica("321312412", "fulano", "fulano da silva", "fulano@email.com", "4002002312", 
            null, null, new Date(), 1000.0, new Endereco("12341235", "Rua dos bobos", "Bairro", "Cidade", "Estado"), 
            new Emprestimo(1000.0, 100.0, "10%", 10, 0, new Date()), false);

        System.out.print(usuario.toString());
    }

    private static void transacaoFactory() {
        Transacao transacao = new Transacao(100.0, "Saque", "Aprovado", new Date(), 
            new ContaBancaria("1234", "1234", 1000.0, "Conta Corrente", true), 
            new ContaBancaria("1234", "1234", 1000.0, "Conta Corrente", true));

        System.out.print(transacao.toString());
    }

    private static void contaBancariaFactory() {
        ContaBancaria contaBancaria = new ContaBancaria("1234", "1234", 1000.0, "Conta Corrente", true);
        System.out.print(contaBancaria.toString());
    }
    private static void contaCorrenteFactory() {
        ContaCorrente contaCorrente = new ContaCorrente(1000.0, "1234", "1234", 1000.0, "Conta Corrente", true);
        System.out.print(contaCorrente.toString());
    }

    private static void contaPoupancaFactory() {
        ContaPoupanca contaPoupanca = new ContaPoupanca("2", "1234", "1234", 1000.0, "Conta Corrente", true);
        System.out.print(contaPoupanca.toString());
    }

    private static void investimentoFactory() {
        Investimento investimento = new Investimento("CDB", 100.0, new Date(), new Date(), 2.0);
        System.out.print(investimento.toString());
    }
}

