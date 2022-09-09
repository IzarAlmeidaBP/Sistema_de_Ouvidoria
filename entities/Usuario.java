package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Usuario {

	private String nomeUser;
	private String loginUser;
	private String senhaUser;
	private String idUser = getIdAlea();

	private List<Manifestacao> manifestacoesAbertas = new ArrayList<>();

	public Usuario() {

	}

	public Usuario(String nomeUser, String loginUser, String senhaUser) {
		this.nomeUser = nomeUser;
		this.loginUser = loginUser;
		this.senhaUser = senhaUser;
	}

	public Usuario(String nomeUser, String senhaUser) {
		super();
		this.nomeUser = nomeUser;
		this.senhaUser = senhaUser;
	}

	public String getNomeUser() {
		return nomeUser;
	}

	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
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
		return manifestacoesAbertas;
	}

	public void addManifestacao(Manifestacao manifestacoes) {
		manifestacoesAbertas.add(manifestacoes);
	}

	public String getIdUser() {
		return idUser;
	}

	public boolean verificaUser(String login, String senha) {
		if (this.nomeUser.equals(login) && this.senhaUser.equals(senha)) {

			return true;
		}
		return false;
	}

	public static String getIdAlea() {
		Random alea = new Random();
		int numero = alea.nextInt(999999);
		return String.format("%06d", numero);
	}

	@Override
	public String toString() {
		return "Nome Completo=" + nomeUser + ", Login =" + loginUser + ", Senha = ******" + ", ID =" + idUser + "]";
	}

}
