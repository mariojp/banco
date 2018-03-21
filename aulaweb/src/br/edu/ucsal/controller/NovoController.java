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
 * Servlet implementation class Novo
 */
@WebServlet("/Novo")
public class NovoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NovoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		if(id != null && !id.isEmpty()) {
			List<Usuario> usuarios = (List) request.getServletContext().getAttribute("lista");
			Usuario u = new Usuario(id);
			int index = usuarios.indexOf(u);
			u = usuarios.get(index);
			request.setAttribute("usuario", u);;
			request.getRequestDispatcher("form.jsp").forward(request, response);
			
		}else {
			response.sendRedirect("form.jsp");
		}
		
	}

}
