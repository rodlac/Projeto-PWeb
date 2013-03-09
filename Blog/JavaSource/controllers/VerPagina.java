package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import facades.PaginaFacade;

import models.Pagina;

/**
 * Servlet implementation class Artigo
 */
@WebServlet("/pagina")
public class VerPagina extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerPagina() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PaginaFacade cp = (PaginaFacade) getServletContext().getAttribute("CadastroPagina");
		Pagina pagina = cp.obter(Integer.parseInt(request.getParameter("id")));
		request.setAttribute("pagina", pagina);
		request.getRequestDispatcher("public/pagina.jsp").forward(request, response);
	}

}
