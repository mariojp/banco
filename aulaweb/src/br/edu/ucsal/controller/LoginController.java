package br.edu.ucsal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ucsal.model.Usuario;

@WebServlet("/login")
public class LoginController extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		Usuario u = new Usuario();
		u.setLogin(login);
		u.setSenha(senha);
		
		if(u.getLogin() != null && !u.getLogin().isEmpty() && u.getLogin().equals(u.getSenha())){
			//response.sendRedirect("sucesso.jsp");
			
			RequestDispatcher rd = request.getRequestDispatcher("sucesso.jsp");
			rd.forward(request, response);
			//response.getWriter().print("<div>SUCESSO!!!!</div>"); 
		}
	
	}
}
