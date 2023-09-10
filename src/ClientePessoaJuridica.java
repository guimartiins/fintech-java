import java.util.Date;

public class ClientePessoaJuridica extends Usuario {

	private String cnpj;
	private String razaoSocial;

	public ClientePessoaJuridica(String cnpj, String razaoSocial, String nome, String email, String telefone,
			String cargo, String funcao, Date dataNascimento, Double salario, Endereco endereco, Emprestimo emprestimo,
			Boolean administrador) {
		super(funcao, funcao, funcao, funcao, funcao, dataNascimento, salario, endereco, emprestimo, administrador);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		
	}

	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	@Override
	public String toString() {
		return "ClientePessoaJuridica [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", "
				+ super.toString() + "]";
	}
}