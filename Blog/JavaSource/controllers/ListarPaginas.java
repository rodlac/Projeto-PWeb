package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import facades.PaginaFacade;

import models.PaginaEstatica;

/**
 * Servlet implementation class ListarArtigos
 */
@WebServlet(urlPatterns="/listar-paginas",name="AdminListarPaginas")
public class ListarPaginas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarPaginas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PaginaFacade cp = (PaginaFacade) getServletContext().getAttribute("CadastroPagina");
		
		List<PaginaEstatica> paginas = cp.obterTodos();		
		request.setAttribute("paginas", paginas);
		request.getRequestDispatcher("admin/listar-paginas.jsp").forward(request, response);
	}

}
