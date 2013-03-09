package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import facades.UsuarioFacade;

import models.UsuarioCadastrado;

/**
 * Servlet implementation class CadastroArtigo
 */
@WebServlet(urlPatterns="/cadastrar-usuario",name="AdminCadastraUsuario")
public class CadastrarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("admin/novo-usuario.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuarioFacade cu = (UsuarioFacade) getServletContext().getAttribute("CadastroUsuario");
		
		UsuarioCadastrado u = new UsuarioCadastrado();
		u.setNome(request.getParameter("nome"));
		u.setEmail(request.getParameter("email"));
		u.setLogin(request.getParameter("login"));
		u.setSenha(request.getParameter("senha"));
		
		cu.cadastrar(u);
		
		request.setAttribute("cadastrado", true);
		request.getRequestDispatcher("admin/novo-usuario.jsp").forward(request, response);
	}

}
