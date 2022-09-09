package enum_Package;

public enum Tipo {

	Reclamacao(1), Sugestao(2), Elogio(3);

	private int valorT;

	private Tipo(int valorT) {
		this.valorT = valorT;
	}

	public int getValorT() {
		return valorT;
	}

	public void setValorT(int valorT) {
		this.valorT = valorT;
	}

}
