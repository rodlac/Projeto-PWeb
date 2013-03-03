package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Pagina;
import controllers.CadastroPagina;

/**
 * Servlet implementation class Artigo
 */
@WebServlet("/artigo")
public class Artigo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Artigo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CadastroPagina cp = (CadastroPagina) getServletContext().getAttribute("CadastroPagina");
		Pagina artigo = cp.obter(Integer.parseInt(request.getParameter("id")));
		request.setAttribute("artigo", artigo);
		request.getRequestDispatcher("public/artigo.jsp").forward(request, response);
	}

}
