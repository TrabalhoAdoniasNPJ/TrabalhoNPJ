package br.unama.npj.Model;

public class ParteProcesso {
	private int id;
	private Pessoa pessoa;
	private Processo processo;
	private TipoParte tipoparte;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}

	public TipoParte getTipoparte() {
		return tipoparte;
	}

	public void setTipoparte(TipoParte tipoparte) {
		this.tipoparte = tipoparte;
	}

	public ParteProcesso(int id, Pessoa pessoa, Processo processo, TipoParte tipoparte) {
		super();
		this.id = id;
		this.pessoa = pessoa;
		this.processo = processo;
		this.tipoparte = tipoparte;
	}
}