package com.jpa.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.model.Pessoa;

public class TestaPersistenceXML {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("projeto-jpa");
		EntityManager entityManager = factory.createEntityManager();

		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("13238965115");
		pessoa.setNome("Nilson Megadeth");

		entityManager.getTransaction().begin();
		entityManager.persist(pessoa);
		entityManager.getTransaction().commit();

		@SuppressWarnings("unchecked")
		List<Pessoa> todasPessoaJPA = entityManager.createQuery("From " + Pessoa.class.getName()).getResultList();
		for (Pessoa pessoaLaco : todasPessoaJPA) {
			System.out.println(pessoaLaco);

		}

	}
}
