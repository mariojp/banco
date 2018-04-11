package br.edu.ucsal.chat;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ucsal.chat.model.Mensagem;
import br.edu.ucsal.chat.model.Sala;
import br.edu.ucsal.chat.model.Usuario;

/**
 * Servlet implementation class MensagemController
 */
@WebServlet("/MensagemController")
public class MensagemController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MensagemController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("chat.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String conteudo = request.getParameter("mensagem");
		String destinatario = request.getParameter("destinatario");
		Sala sala = (Sala) request.getServletContext().getAttribute("sala");
		Usuario usuario =  (Usuario) request.getSession().getAttribute("usuario");
		Mensagem mensagem = new Mensagem(usuario, conteudo);
		sala.addMensagem(mensagem,destinatario);
		
		response.sendRedirect("chat.jsp");
		//request.getRequestDispatcher("chat.jsp").forward(request, response);
		
		
	}

}
