package mapeamento;

import java.util.List;

public class Agencia {

	private String nome;
	private Banco Banco;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Banco getBanco() {
		return Banco;
	}

	public void setBanco(Banco banco) {
		Banco = banco;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
}


