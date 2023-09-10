import java.util.Date;
public class Main {
    public static void main(String[] args) {
        System.out.println("Rodando o programa...");
        cartaoFactory();
        emprestimoFactory();
        usuarioFactory();
        clientePessoaFisicaFactory();
        clientePessoaJuridicaFactory();
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
        ClientePessoaFisica usuario = new ClientePessoaFisica("Fulano da Silva", "fulano@email.com", "40028922", "Programador", "", 
            null, null, new Date(), 1000.0, new Endereco("12341235", "Rua dos bobos", "Bairro", "Cidade", "Estado"), 
            new Emprestimo(1000.0, 100.0, "10%", 10, 0, new Date()), false);

        System.out.print(usuario.toString());
    }

    private static void clientePessoaJuridicaFactory() {
        ClientePessoaJuridica usuario = new ClientePessoaJuridica("Fulano da Silva", "fulano@email.com", "40028922", "Programador", "", 
            null, null, new Date(), 1000.0, new Endereco("12341235", "Rua dos bobos", "Bairro", "Cidade", "Estado"), 
            new Emprestimo(1000.0, 100.0, "10%", 10, 0, new Date()), false);

        System.out.print(usuario.toString());
    }
}

