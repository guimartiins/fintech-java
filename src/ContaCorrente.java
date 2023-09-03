
public class ContaCorrente extends ContaBancaria{
	private double limiteCredito;
	
	public ContaCorrente() {
		super();
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
	
	
}
