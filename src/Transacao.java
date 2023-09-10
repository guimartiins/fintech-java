import java.util.Date;

public class Transacao {
	private double valor;
	private String tipo;
	private String status;
	private Date dataCriacao;
	private ContaBancaria contaOrigem;
	private ContaBancaria contaDestino;
	
    public Transacao() {} 
	public Transacao(double valor, String tipo, String status, Date dataCriacao, ContaBancaria contaOrigem,
			ContaBancaria contaDestino) {
		this.valor = valor;
		this.tipo = tipo;
		this.status = status;
		this.dataCriacao = dataCriacao;
		this.contaOrigem = contaOrigem;
		this.contaDestino = contaDestino;
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
	public Date getdataCriacao() {
		return dataCriacao;
	}
	public void setdataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public ContaBancaria getContaOrigem() {
		return contaOrigem;
	}
	public void setContaOrigem(ContaBancaria contaOrigem) {
		this.contaOrigem = contaOrigem;
	}
	public ContaBancaria getcontaDestino() {
		return contaDestino;
	}
	public void setcontaDestino(ContaBancaria contaDestino) {
		this.contaDestino = contaDestino;
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
	

	@Override
    public String toString() {
        return "Transacao {" +
                "valor=" + valor +
                ", tipo='" + tipo + '\'' +
                ", status='" + status + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", contaOrigem=" + contaOrigem +
                ", contaDestino=" + contaDestino +
                "}" + "\n";
    }
}