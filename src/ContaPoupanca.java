
public class ContaPoupanca extends ContaBancaria{
	private String juros;

    public ContaPoupanca() {
        super();
    }
	
	public ContaPoupanca(String juros, String agencia, String conta, double saldo, String tipoConta, boolean ativo) {
        super(agencia, conta, saldo, tipoConta, ativo);
        this.juros = juros;
    }

	public String getJuros() {
		return juros;
	}

	public void setJuros(String juros) {
		this.juros = juros;
	}

	@Override
	public String toString() {
		return "ContaPoupanca {juros=" + juros + ", " + super.toString() + "}";
	}
}