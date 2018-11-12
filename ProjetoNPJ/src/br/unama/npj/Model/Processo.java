package br.unama.npj.Model;

public class Processo {
	
	private int id;
	private Area area;
	private SituacaoProcesso situacaoProcesso;
	
	
	
	public Processo(int id, Area area, SituacaoProcesso situacaoProcesso) {
		super();
		this.id = id;
		this.area = area;
		this.situacaoProcesso = situacaoProcesso;
	}




	public Processo() {
		super();
	}

	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public SituacaoProcesso getSituacaoProcesso() {
		return situacaoProcesso;
	}

	public void setSituacaoProcesso(SituacaoProcesso situacaoProcesso) {
		this.situacaoProcesso = situacaoProcesso;
	}
	
	
}