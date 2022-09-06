package enum_Package;

public enum Situacao {

	Em_Andamento(1), Respondida(2), Resolvido(3);

	private Integer valor;

	Situacao(Integer valor) {
		this.valor = valor;
	}
	public Integer getValor() {
		return valor;
	}
}
