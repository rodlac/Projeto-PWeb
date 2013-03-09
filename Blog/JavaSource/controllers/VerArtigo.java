package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import facades.ArtigoFacade;

import models.Artigo;

/**
 * Servlet implementation class Artigo
 */
@WebServlet("/artigo")
public class VerArtigo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerArtigo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArtigoFacade ca = (ArtigoFacade) getServletContext().getAttribute("CadastroArtigo");
		Artigo artigo = ca.obter(Integer.parseInt(request.getParameter("id")));
		request.setAttribute("artigo", artigo);
		request.getRequestDispatcher("public/artigo.jsp").forward(request, response);
	}

}
