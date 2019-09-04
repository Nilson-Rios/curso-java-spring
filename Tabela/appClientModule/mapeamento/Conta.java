package mapeamento;

public class Conta {

	private Cliente titular;
	private int numero;
	private int indentificador;

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getIndentificador() {
		return indentificador;
	}

	public void setIndentificador(int indentificador) {
		this.indentificador = indentificador;
	}

}
