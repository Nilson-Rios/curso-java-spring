package com.framework.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.model.Pessoa;

public class PessoaDao {

	// Nossa classe PessoaDao segue o padrão de projeto Singleton que garante que
	// apenas uma instância dessa classe será criada durante toda a aplicação

	private static PessoaDao instance;
	EntityManager entityManager;

	private PessoaDao() {
		entityManager = getEntityManager();
	}

	public static PessoaDao getInstance() {
		if (instance == null) {
			instance = new PessoaDao();
		}
		return instance;
	}

	private EntityManager getEntityManager() {
		if (entityManager == null) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("projeto-jpa");
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}

	public void persist(Pessoa pessoa) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(pessoa);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public Pessoa getById(final int id) {
		return entityManager.find(Pessoa.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Pessoa> findAll() {
		return entityManager.createQuery("FROM " + Pessoa.class.getName()).getResultList();
	}

// o método merge segue o mesmo princípio do método persist a única diferença é que o merge atualiza o registro e não apenas insere ele no banco.
	public void merge(Pessoa pessoa) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(pessoa);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
//neste método instancio a pessoa para depois remover
	public void remove(Pessoa pessoa) {
		try {
			entityManager.getTransaction().begin();
			pessoa = entityManager.find(Pessoa.class, pessoa.getId());
			entityManager.remove(pessoa);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
//nesse método removo a pessoa pelo id
	public void removeById(final int id) {
		try {
			Pessoa pessoa2 = new Pessoa();
			pessoa2.setId(2);
			remove(pessoa2);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}