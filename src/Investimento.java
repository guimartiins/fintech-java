import java.util.Date;

public class Investimento {
	private String tipo;
	private double value;
	private Date dataCriacao;
	private Date dataVencimento;
	private double lucroPorcentagem;
	
	public Investimento() {
		super();
	}

	public Investimento(String tipo, double value, Date dataCriacao, Date dataVencimento, double lucroPorcentagem) {
		super();
		this.tipo = tipo;
		this.value = value;
		this.dataCriacao = dataCriacao;
		this.dataVencimento = dataVencimento;
		this.lucroPorcentagem = lucroPorcentagem;
	}

    public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public double getValue() {
		return value;
	}


	public void setValue(double value) {
		this.value = value;
	}


	public Date getDataCriacao() {
		return dataCriacao;
	}


	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}


	public Date getDataVencimento() {
		return dataVencimento;
	}


	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}


	public double getLucroPorcentagem() {
		return lucroPorcentagem;
	}


	public void setLucroPorcentagem(double lucroPorcentagem) {
		this.lucroPorcentagem = lucroPorcentagem;
	}
	
	public Transacao realizarInvestimento() {
	    Transacao transacao = new Transacao();
	    return transacao;
	}
	
	
	public Transacao sacar(double valor) {
		 Transacao transacao = new Transacao();
		 transacao.setValor(valor);
		 return transacao;
	}
	
    @Override
    public String toString() {
        return "Investimento {tipo=" + tipo + ", value=" + value + ", dataCriacao=" + dataCriacao + ", dataVencimento=" + dataVencimento + ", lucroPorcentagem=" + lucroPorcentagem + "}";
    }
}