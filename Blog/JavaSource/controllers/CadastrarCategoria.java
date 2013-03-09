package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import facades.CategoriaFacade;


import models.Categoria;


/**
 * Servlet implementation class CadastroCategoria
 */
@WebServlet(urlPatterns="/cadastrar-categoria",name="AdminCadastraCategoria")
public class CadastrarCategoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarCategoria() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("admin/nova-categoria.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoriaFacade ct = (CategoriaFacade) getServletContext().getAttribute("CadastroCategoria");
		Categoria c = new Categoria();
		c.setNome(request.getParameter("nome"));
		c.setDescricao(request.getParameter("descricao"));
		ct.cadastrar(c);
		
		request.setAttribute("cadastrado", true);
		request.getRequestDispatcher("admin/nova-categoria.jsp").forward(request,response);
	}

}
