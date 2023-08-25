package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Cadastrando nova Empresa");
		
		String nomeEmpresa = request.getParameter("nome");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("Empresa " + nomeEmpresa + " cadastrada com sucesso!");
		out.print("</body>");
		out.print("</html>");
	}

}
