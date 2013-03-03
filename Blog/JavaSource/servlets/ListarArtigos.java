package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Pagina;
import controllers.CadastroPagina;

/**
 * Servlet implementation class ListarArtigos
 */
@WebServlet("/listar-artigos")
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
		CadastroPagina cp = (CadastroPagina) getServletContext().getAttribute("CadastroPagina");
		List<Pagina> categorias = cp.obterTodos();
		request.setAttribute("artigos", categorias);
		request.getRequestDispatcher("admin/listar-artigos.jsp").forward(request, response);
	}

}
