
public class ContaPoupanca extends ContaBancaria{
	private String juros;

	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String juros) {
		super();
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
		return "ContaPoupanca [juros=" + juros + ", getJuros()=" + getJuros() + ", getAgencia()=" + getAgencia()
				+ ", getConta()=" + getConta() + ", getSaldo()=" + getSaldo() + ", getTipoConta()=" + getTipoConta()
				+ ", isAtivo()=" + isAtivo() + ", criarConta()=" + criarConta() + ", consultarSaldo()="
				+ consultarSaldo() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
}
