package br.edu.ucsal.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ucsal.model.Usuario;

/**
 * Servlet implementation class SalvaController
 */
@WebServlet("/Salvar")
public class SalvaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SalvaController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String id = request.getParameter("id");
		List<Usuario> usuarios = (List) request.getServletContext().getAttribute("lista");
		
		
		if(id == null || id.isEmpty()) {
			Usuario usuario = new Usuario();
			usuario.setLogin(login);
			usuario.setSenha(senha);
			usuarios.add(usuario);
			
		} else {
			Usuario u = new Usuario(id);
			
			int index = usuarios.indexOf(u);
			
			u = usuarios.get(index);
			u.setLogin(login);
			u.setSenha(senha);
		}
		response.sendRedirect("lista.jsp");
		
	}

}
