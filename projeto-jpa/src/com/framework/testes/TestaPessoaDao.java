package com.framework.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.framework.dao.PessoaDao;
import com.jpa.model.Pessoa;

public class TestaPessoaDao {
	static PessoaDao pessoaDao = PessoaDao.getInstance();

	public static void main(String[] args) {
		// incluirPessoa();
		buscarPessoaPorId();
		alterarPessoa();
		buscarPessoaPorId();
		//removerPessoa();
		//removerPessoaPorId();
		
	}

	private static void incluirPessoa() {
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("008.295.201-98");
		pessoa.setNome("Nilson");
		pessoaDao.persist(pessoa);
	}

	private static void buscarPessoaPorId() {
		Pessoa p = pessoaDao.getById(2);
		System.out.println(p);

	}

	private static void listarTdoasPessoas() {
		List<Pessoa> todasPessoaJPA = pessoaDao.findAll();
		for (Pessoa pessoaLaco : todasPessoaJPA) {
			System.out.println(pessoaLaco);
		}
	}

	private static void alterarPessoa() {
		Pessoa pessoaAlterar = new Pessoa();
		pessoaAlterar.setId(2);
		pessoaAlterar.setCpf("0000000000");
		pessoaAlterar.setNome("Jose");

		pessoaDao.merge(pessoaAlterar);

	}

	private static void removerPessoaPorId() {
		pessoaDao.removeById(2);
	}

	private static void removerPessoa() {
		Pessoa removerPessoa = new Pessoa();
		removerPessoa.setId(1);
		pessoaDao.remove(removerPessoa);
	}
}
