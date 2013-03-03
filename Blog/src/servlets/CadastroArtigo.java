package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Categoria;

/**
 * Servlet implementation class CadastroArtigo
 */
@WebServlet("/cadastrar-artigo")
public class CadastroArtigo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroArtigo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//CadastroCategoria ct = CadastroCategoria.getInstance();
		List<Categoria> categorias = new ArrayList<Categoria>();
		Categoria c = new Categoria();
		c.setId(1);
		c.setNome("Teste1");
		categorias.add(c);
		
		c = new Categoria();
		c.setId(2);
		c.setNome("Teste2");
		categorias.add(c);
		
		c = new Categoria();
		c.setId(3);
		c.setNome("Teste3");
		categorias.add(c);
		
		
		
		request.setAttribute("categorias", categorias);
		
		request.getRequestDispatcher("admin/novo-artigo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
