import java.util.Date;
public class Main {
    public static void main(String[] args) {
        System.out.println("Rodando o programa...");
        cartaoFactory();
    }

    private static void cartaoFactory() {
        Cartao cartao = new Cartao("Visa", new Date(), 1234, "Fulano da Silva", 1234567890, "Crédito", true, 1000);

        if (cartao.verificarValidade()) {
            System.out.println("O cartão está válido.");
        } else {
            System.out.println("O cartão está expirado.");
        }

        double debito = cartao.verificarDebito();
        System.out.println("O débito atual é de R$" + debito);

        cartao.ativarCartao();
        System.out.println("O cartão foi ativado.");

        cartao.bloquearCartao();
        System.out.println("O cartão foi bloqueado.");

        if (cartao.pagarFatura(200)) {
            System.out.println("A fatura foi paga.");
        } else {
            System.out.println("Não foi possível pagar a fatura.");
        }
    }
}

