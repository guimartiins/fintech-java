import java.util.Date;
public class Main {
    public static void main(String[] args) {
        System.out.println("Rodando o programa...");
        cartaoFactory();
    }

    private static void cartaoFactory() {
        Cartao cartao = new Cartao("Visa", new Date(), 1234, "Fulano da Silva", 1234567890, "Crédito", true, 1000);
        System.out.print(cartao.toString());
    }
}

