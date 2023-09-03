
/**
 * INACABADA
 */
public class ContaBancaria {
	private String agencia;
	private String conta;
	private double saldo;
	private String tipoConta;
	private boolean ativo;
	
	public ContaBancaria() {
		super();
	}
	public ContaBancaria(String agencia, String conta, double saldo, String tipoConta, boolean ativo) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.tipoConta = tipoConta;
		this.ativo = ativo;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public Transacao sacar(double valor) {
	    Transacao transacao = new Transacao();
	    if(valor < this.saldo) {
	    	transacao.setValor(valor);
	    } else {
	    	System.out.println("Valor do saque maior que valor de saldo");
	    }
	    return transacao;
	}
	
	public Transacao depositar(double valor) {
	    Transacao transacao = new Transacao();
	    transacao.setValor(valor);
	    return transacao;
	}
	
	public void transferir(double valor, ContaBancaria contaDestino) {
	    if (this.saldo >= valor) {
	        this.saldo -= valor;
	        contaDestino.saldo += valor;
	    } else {
	        System.out.println("Saldo insuficiente para realizar a transferência.");
	    }
	}
	
	public boolean criarConta() {
		return this.ativo = true;
	}
	
	public double consultarSaldo() {
		return this.saldo;	
	}
	
	public boolean atualizarAtivo(boolean status) {
		return this.ativo = status;
	}
	
	@Override
	public String toString() {
		return "ContaBancaria [agencia=" + agencia + ", conta=" + conta + ", saldo=" + saldo + ", tipoConta="
				+ tipoConta + ", ativo=" + ativo + "]";
	}
	
	
}
