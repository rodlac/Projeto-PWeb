package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import facades.CategoriaFacade;


import models.Categoria;

/**
 * Servlet implementation class ListaCategorias
 */
@WebServlet(urlPatterns="/listar-categorias",name="AdminListarCategorias")
public class ListarCategorias extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCategorias() {
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
		request.getRequestDispatcher("admin/listar-categorias.jsp").forward(request, response);
	}

}
