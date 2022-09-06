package entities;

import enum_Package.Situacao;
import enum_Package.Tipo;

public class Manifestacao {

	private int id;
	private String titulo;
	private String descricao;
	private Tipo tipoMani;
	private Situacao situacaoMani;

	public Manifestacao() {

	}

	public Manifestacao(int id, String titulo, String descricao, Tipo tipoMani, Situacao situcaoMani) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.tipoMani = tipoMani;
		this.situacaoMani = situcaoMani;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Tipo getTipoMani() {
		return tipoMani;
	}

	public void setTipoMani(Tipo tipoMani) {
		this.tipoMani = tipoMani;
	}

	public Situacao getSitucaoMani() {
		return situacaoMani;
	}

	public void setSitucaoMani(Situacao situcaoMani) {
		this.situacaoMani = situcaoMani;
	}

	public int criaManiID() {
		return this.id = id + 1;
	}

}
