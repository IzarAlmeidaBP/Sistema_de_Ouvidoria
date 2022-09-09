package enum_Package;

public enum Tipo {

	RECLAMAÇÃO(1), SUGESTÃO(2), ELOGIO(3);

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
