package formulario;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormularioProfissao")
public class FormularioProfissao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String nome = request.getParameter("nome");
		String profissao = request.getParameter("profissao");

		out.println("<html>"
				+ "<body>"
				+ "<h1>"+ nome + "</h1>"
				+ "<h1>"+ profissao + "</h1>"

				+ "</body></html>");
				}
			
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
