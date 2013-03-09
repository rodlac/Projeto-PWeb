package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import facades.UsuarioFacade;

import models.Usuario;

/**
 * Servlet implementation class ListarArtigos
 */
@WebServlet(urlPatterns="/listar-usuarios",name="AdminListarUsuarios")
public class ListarUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuarioFacade cu = (UsuarioFacade) getServletContext().getAttribute("CadastroUsuario");
		
		List<Usuario> usuarios = cu.obterTodos();
		request.setAttribute("usuarios", usuarios);
		request.getRequestDispatcher("admin/listar-usuarios.jsp").forward(request, response);
	}

}
