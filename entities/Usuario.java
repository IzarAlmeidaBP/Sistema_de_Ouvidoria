package entities;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nomeUser;
	private Integer idUser;
	private String loginUser;
	private String senhaUser;

	private List<Manifestacao> manfistacoesAbertas = new ArrayList<>();
	
	

	public Usuario() {

	}

	public Usuario(String nomeUser, String loginUser, String senhaUser) {
		this.nomeUser = nomeUser;
		this.loginUser = loginUser;
		this.senhaUser = senhaUser;
	}

	public Usuario(String nomeUser, Integer idUser, String loginUser, String senhaUser) {
		this.nomeUser = nomeUser;
		this.idUser = idUser;
		this.loginUser = loginUser;
		this.senhaUser = senhaUser;
	}

	public String getNomeUser() {
		return nomeUser;
	}

	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}

	public String getSenhaUser() {
		return senhaUser;
	}

	public void setSenhaUser(String senhaUser) {
		this.senhaUser = senhaUser;
	}

	public List<Manifestacao> getManfistacoes() {
		return manfistacoesAbertas;
	}

}