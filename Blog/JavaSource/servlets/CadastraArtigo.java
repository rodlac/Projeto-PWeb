package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Artigo;
import models.Categoria;
import controllers.CadastroCategoria;
import controllers.CadastroPagina;

/**
 * Servlet implementation class CadastroArtigo
 */
@WebServlet("/cadastrar-artigo")
public class CadastraArtigo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastraArtigo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CadastroCategoria ct = (CadastroCategoria) getServletContext().getAttribute("CadastroCategoria");
		//CadastroPagina cp = (CadastroPagina) getServletContext().getAttribute("CadastroPagina");
		
		List<Categoria> categorias = ct.obterTodos();		
		request.setAttribute("categorias", categorias);
		request.getRequestDispatcher("admin/novo-artigo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CadastroCategoria ct = (CadastroCategoria) getServletContext().getAttribute("CadastroCategoria");
		CadastroPagina cp = (CadastroPagina) getServletContext().getAttribute("CadastroPagina");
		
		Categoria c = ct.obter(Integer.parseInt(request.getParameter("categoria")));
		Artigo a = new Artigo();
		a.setTitulo(request.getParameter("titulo"));
		a.setCategoria(c);
		a.setTexto(request.getParameter("texto"));
		
		cp.cadastrar(a);
		
		request.setAttribute("cadastrado", true);
		request.getRequestDispatcher("admin/novo-artigo.jsp").forward(request, response);
	}

}
