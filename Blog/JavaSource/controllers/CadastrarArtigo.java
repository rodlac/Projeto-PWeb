package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import facades.ArtigoFacade;
import facades.CategoriaFacade;

import models.Artigo;
import models.Categoria;
import models.UsuarioCadastrado;

/**
 * Servlet implementation class CadastroArtigo
 */
@WebServlet(urlPatterns="/cadastrar-artigo",name="AdminCadastraArtigo")
public class CadastrarArtigo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarArtigo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoriaFacade ct = (CategoriaFacade) getServletContext().getAttribute("CadastroCategoria");
		
		List<Categoria> categorias = ct.obterTodos();		
		request.setAttribute("categorias", categorias);
		request.getRequestDispatcher("admin/novo-artigo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoriaFacade ct = (CategoriaFacade) getServletContext().getAttribute("CadastroCategoria");
		ArtigoFacade ca = (ArtigoFacade) getServletContext().getAttribute("CadastroArtigo");
		
		Categoria c = ct.obter(Integer.parseInt(request.getParameter("categoria")));
		Artigo a = new Artigo();
		a.setTitulo(request.getParameter("titulo"));
		a.setCategoria(c);
		a.setTexto(request.getParameter("texto"));
		UsuarioCadastrado user = (UsuarioCadastrado) request.getSession().getAttribute("user");
		a.setUsuario(user);
		
		ca.cadastrar(a);
		
		request.setAttribute("cadastrado", true);
		request.getRequestDispatcher("admin/novo-artigo.jsp").forward(request, response);
	}

}
