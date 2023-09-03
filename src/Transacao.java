import java.sql.Date;

//não acbada

public class Transacao {
	private double valor;
	private String tipo;
	private String status;
	private Date dataCriaca;
	private ContaBancaria contaOrigem;
	private ContaBancaria contaDestino;
	
	public Transacao() {
		super();
	}

	public Transacao(double valor, String tipo, String status, Date dataCriaca, ContaBancaria contaOrigem,
			ContaBancaria cotaDestino) {
		super();
		this.valor = valor;
		this.tipo = tipo;
		this.status = status;
		this.dataCriaca = dataCriaca;
		this.contaOrigem = contaOrigem;
		this.contaDestino = cotaDestino;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDataCriaca() {
		return dataCriaca;
	}
	public void setDataCriaca(Date dataCriaca) {
		this.dataCriaca = dataCriaca;
	}
	public ContaBancaria getContaOrigem() {
		return contaOrigem;
	}
	public void setContaOrigem(ContaBancaria contaOrigem) {
		this.contaOrigem = contaOrigem;
	}
	public ContaBancaria getCotaDestino() {
		return contaDestino;
	}
	public void setCotaDestino(ContaBancaria cotaDestino) {
		this.contaDestino = cotaDestino;
	}
	
	public Transacao registrar() {
		return this;
		
	}
	public Transacao listar() {
		return this;
	}
	public Transacao cancelar() {
		return this;
	}
	

	
}
