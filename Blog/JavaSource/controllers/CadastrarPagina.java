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
 * Servlet implementation class CadastraPagina
 */
@WebServlet(urlPatterns="/cadastrar-pagina",name="AdminCadastraPagina")
public class CadastrarPagina extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarPagina() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PaginaFacade cp = (PaginaFacade) getServletContext().getAttribute("CadastroPagina");
		
		List<PaginaEstatica> paginas = cp.obterTodos();
		paginas.add(0, null);
		request.setAttribute("paginas", paginas);
		request.getRequestDispatcher("admin/nova-pagina.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PaginaFacade cp = (PaginaFacade) getServletContext().getAttribute("CadastroPagina");
		
		PaginaEstatica pagina = new PaginaEstatica();
		if(request.getParameter("pai") != null && !request.getParameter("pai").equals("")) {
			PaginaEstatica pai = cp.obter(Integer.parseInt(request.getParameter("pai")));
			pagina.setPai(pai);
		}
		pagina.setTitulo(request.getParameter("titulo"));
		pagina.setTexto(request.getParameter("texto"));
		
		cp.cadastrar(pagina);
		
		request.setAttribute("cadastrado", true);
		request.getRequestDispatcher("admin/nova-pagina.jsp").forward(request, response);
	}

}
