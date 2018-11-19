package br.unama.npj.Model;

public class Endereco {
	
	private int id;
	private String cep;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String estado;
	private String municipio;
	private Pessoa pessoa_id;
	
	
	
	
	public Endereco() {
		super();
	}


	public Endereco(int id, String cep, String logradouro, String numero, String complemento, String bairro, String estado,
			String municipio, Pessoa pessoa_id) {
		super();
		this.id = id;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.estado = estado;
		this.municipio = municipio;
		this.pessoa_id = pessoa_id;
	}
	
	public Endereco(String cep, String logradouro, String numero, String complemento, String bairro, String estado,
			String municipio, Pessoa pessoa_id) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.estado = estado;
		this.municipio = municipio;
		this.pessoa_id = pessoa_id;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public Pessoa getPessoa_id() {
		return pessoa_id;
	}
	public void setPessoa_id(Pessoa pessoa_id) {
		this.pessoa_id = pessoa_id;
	}
	
	
	

	

}
