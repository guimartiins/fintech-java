//package br.com.fiap.model;

import java.util.Date;

public class Usuario {
	
	private	String nome;
	private	String email;
	private	String telefone;
	private	String cargo;
	private	String funcao;
	private	Date dataNascimento;
	private	Double salario;
	private	Endereco endereco;
	private Emprestimo emprestimo;
	private	Boolean administrador;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Emprestimo getEmprestimo() {
		return emprestimo;
	}
	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}
	public boolean isAdministrador() {
		return administrador;
	}
	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}
	
	
	@Override
	public String toString() {
		return "Usuario [nome =" + nome + ", email =" + email + ", telefone = " + telefone + ", cargo =" + cargo
				+ ", funcao =" + funcao + ", dataNascimento =" + dataNascimento + ", salario =" + salario + ", endereco="
				+ endereco + ", emprestimo = " + emprestimo +" , administrador = " + administrador + "]";
	}
	
	
	
}
