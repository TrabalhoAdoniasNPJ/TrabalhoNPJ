package br.unama.npj.Model;

public class Aluno {
	private int id;
	private String nome;
	private String matricula;
	private String cpf;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Aluno(String nome, String matricula, String cpf) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
	}
}