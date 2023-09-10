
public class ContaCorrente extends ContaBancaria {
	private double limiteCredito;
	
    public ContaCorrente() {
        super();
    }

    public ContaCorrente(double limiteCredito, String agencia, String conta, double saldo, String tipoConta, boolean ativo) {
        super(agencia, conta, saldo, tipoConta, ativo);
        this.limiteCredito = limiteCredito;
    }

	public ContaCorrente(double limiteCredito) {
		super();
		this.limiteCredito = limiteCredito;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	@Override
    public String toString() {
        return "ContaCorrente {limiteCredito=" + limiteCredito + ", " + super.toString() + "}";
    }
}