package entities;

import java.util.Random;
import java.util.UUID;

import enum_Package.Situacao;
import enum_Package.Tipo;

public class Manifestacao {

	private String idMani = getIdManiAlea();
	private String titulo;
	private String descricao;
	private Tipo tipoMani;
	private Situacao situacaoMani;
	
	

	public Manifestacao() {

	}

	public Manifestacao(String titulo, String descricao) {
		this.idMani = idMani;
		this.titulo = titulo;
		this.descricao = descricao;
	}

	public Manifestacao(String titulo, String descricao, Tipo tipoMani, Situacao situcaoMani) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.tipoMani = tipoMani;
		this.situacaoMani = situcaoMani;
	}

	public String getIdMani() {
		return idMani;
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

	public static String getIdManiAlea() {
		Random aleatorio = new Random();
		int numero = aleatorio.nextInt(99999);
		return String.format("%06d", numero);
	}

	@Override
	public String toString() {
		return "O ID da sua Manifestcação é:" + idMani + "\nO titulo da sua manifestação é: " + titulo
				+ "\nSua Manifestação:" + descricao;
	}

}
