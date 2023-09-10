import java.util.Date;

public class ClientePessoaFisica extends Usuario {
	private String cpf;
	private String rg;

    public ClientePessoaFisica(String cpf, String rg, String nome, String email, String telefone, String cargo,
            String funcao, Date dataNascimento, Double salario, Endereco endereco, Emprestimo emprestimo,
            Boolean administrador) {
        super(funcao, funcao, funcao, funcao, funcao, dataNascimento, salario, endereco, emprestimo, administrador);
        this.cpf = cpf;
        this.rg = rg;
        
    }

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "ClientePessoaFisica [cpf=" + cpf + ", rg=" + rg + "," + super.toString() + "]";
	}
}