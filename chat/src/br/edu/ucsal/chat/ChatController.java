package br.edu.ucsal.chat;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.prism.Texture.Usage;

import br.edu.ucsal.chat.model.Sala;
import br.edu.ucsal.chat.model.Usuario;
import sun.rmi.server.Dispatcher;

/**
 * Servlet implementation class ChatController
 */
@WebServlet("/ChatController")
public class ChatController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChatController() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("usuario");
		
		Usuario usuario =  new Usuario(name, "#ccc");
		Sala sala = (Sala) request.getServletContext().getAttribute("sala");
		
		if(name != null 
				&& name.trim().length() > 3 
				&& sala.adicionarUsuario(usuario) && !name.equals("TODOS")) {
			request.getSession().setAttribute("usuario", usuario);
			sala.adicionarUsuario(usuario);
			response.sendRedirect("chat.jsp");
		}else {
			response.sendRedirect("index.jsp");
		}
		
//		
//		RequestDispatcher d = request.getRequestDispatcher("chat.jsp");
//		d.forward(request, response);
	}

}
