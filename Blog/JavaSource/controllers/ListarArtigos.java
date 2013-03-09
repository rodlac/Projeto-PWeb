package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import facades.ArtigoFacade;

import models.Artigo;

/**
 * Servlet implementation class ListarArtigos
 */
@WebServlet(urlPatterns="/listar-artigos",name="AdminListarArtigos")
public class ListarArtigos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarArtigos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArtigoFacade ca = (ArtigoFacade) getServletContext().getAttribute("CadastroArtigo");
		List<Artigo> artigos = ca.obterTodos();
		request.setAttribute("artigos", artigos);
		request.getRequestDispatcher("admin/listar-artigos.jsp").forward(request, response);
	}

}
