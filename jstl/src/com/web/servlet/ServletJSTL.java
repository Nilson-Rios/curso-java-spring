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

import com.web.model.Livro;


@WebServlet("/ServletJSTL")
public class ServletJSTL extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Livro livro = new Livro();
		livro.setAutor("Nilson");
		livro.setDescricao("Livro escrito por Nilson");
		livro.setTitulo("O livro");
		
		Livro livro2 = new Livro();
		livro2.setAutor("Nilson");
		livro2.setDescricao("Livro escrito por Nilson");
		livro2.setTitulo("O livro");
		
		Livro livro3 = new Livro();
		livro3.setAutor("Nilson");
		livro3.setDescricao("Livro escrito por Nilson");
		livro3.setTitulo("O livro");
		
		Livro livro4 = new Livro();
		livro4.setAutor("Nilson");
		livro4.setDescricao("Livro escrito por Nilson");
		livro4.setTitulo("O livro");
		
		Livro livro5 = new Livro();
		livro5.setAutor("Nilson");
		livro5.setDescricao("Livro escrito por Nilson");
		livro5.setTitulo("O livro");
		
		List<Livro> listaLivros = new ArrayList<>();
		listaLivros.add(livro);
		listaLivros.add(livro2);
		listaLivros.add(livro3);
		listaLivros.add(livro4);
		listaLivros.add(livro5);
		
		request.setAttribute("listaLivrosNoAtributo", listaLivros);

		//Mantém informações "settadas" na requisição/request
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/listagem.jsp");
		rd.forward(request, response);
 	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
