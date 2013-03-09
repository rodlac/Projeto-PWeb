package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Usuario;
import dao.DAOUsuarioCadastrado;

/**
 * Servlet implementation class CadastroArtigo
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("public/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOUsuarioCadastrado dao = new DAOUsuarioCadastrado();
		Usuario u = dao.findByCredentials(request.getParameter("login"), request.getParameter("senha"));
		if(u != null) {
			request.getSession().setAttribute("user", u);
			response.sendRedirect("./");
		} else {
			request.setAttribute("error", true);
			request.getRequestDispatcher("public/login.jsp").forward(request, response);
		}
	}

}
