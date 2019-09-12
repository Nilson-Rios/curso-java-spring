package com.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.model.Pessoa;

@WebServlet("/ServletPessoas")
public class ServletPessoas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletPessoas() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Nilson");
		pessoa.setProfissao("advogado");
		pessoa.setId(1);

		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Maria");
		pessoa1.setProfissao("secretaria");
		pessoa1.setId(2);


		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Pedro");
		pessoa2.setProfissao("gerente");
		pessoa2.setId(3);


		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Marcelo");
		pessoa3.setProfissao("diretor");
		pessoa3.setId(4);
		
		List<Pessoa> listaPessoas = new ArrayList<>();
		listaPessoas.add(pessoa);
		listaPessoas.add(pessoa1);
		listaPessoas.add(pessoa2);
		listaPessoas.add(pessoa3);

		request.setAttribute("listaPessoas", listaPessoas);
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/listagemPessoas.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
