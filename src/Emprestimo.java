import java.util.Date;

public class Emprestimo {

	private Double valor;
	private Double tributo;
	private String jurosMensal;
	private int quantidadeParcela;
	private int quantidadeParcelaPaga;
	private Date data;

    public Emprestimo(Double valor, Double tributo, String jurosMensal, int quantidadeParcela, int quantidadeParcelaPaga,
            Date data) {
        this.valor = valor;
        this.tributo = tributo;
        this.jurosMensal = jurosMensal;
        this.quantidadeParcela = quantidadeParcela;
        this.quantidadeParcelaPaga = quantidadeParcelaPaga;
        this.data = data;
    }

	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double getTributo() {
		return tributo;
	}
	public void setTributo(Double tributo) {
		this.tributo = tributo;
	}
	public String getJurosMensal() {
		return jurosMensal;
	}
	public void setJurosMensal(String jurosMensal) {
		this.jurosMensal = jurosMensal;
	}
	public int getQuantidadeParcela() {
		return quantidadeParcela;
	}
	public void setQuantidadeParcela(int quantidadeParcela) {
		this.quantidadeParcela = quantidadeParcela;
	}
	public int getQuantidadeParcelaPaga() {
		return quantidadeParcelaPaga;
	}
	public void setQuantidadeParcelaPaga(int quantidadeParcelaPaga) {
		this.quantidadeParcelaPaga = quantidadeParcelaPaga;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Emprestimo {valor=" + valor + ", tributo=" + tributo + ", jurosMensal=" + jurosMensal
                + ", quantidadeParcela=" + quantidadeParcela + ", quantidadeParcelaPaga=" + quantidadeParcelaPaga
                + ", data=" + data + "}" + "\n";
	}
}