//package br.com.fiap.model;

public class ClientePessoaFisica extends Usuario {
	
	private String cpf;
	private String rg;
	
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
