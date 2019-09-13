package com.jpa.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.model.Cliente;

public class TestaPersistenceXML {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-projeto-b");
		EntityManager entityManager = factory.createEntityManager();

		Cliente cliente = new Cliente();
		cliente.setNome("Nilson");
		cliente.setProfissao("analista junior");
		
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();

		@SuppressWarnings("unchecked")
		List<Cliente> todasClienteJPA = entityManager.createQuery("From " + Cliente.class.getName()).getResultList();
		for (Cliente clienteLaco : todasClienteJPA) {
			System.out.println(clienteLaco);
		}
	}
}