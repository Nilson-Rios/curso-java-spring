package com.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private String profissao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", profissao=" + profissao + "]";
	}

}
