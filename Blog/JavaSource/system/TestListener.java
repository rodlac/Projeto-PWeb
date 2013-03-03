package system;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import controllers.CadastroCategoria;
import controllers.CadastroComentario;
import controllers.CadastroPagina;
import controllers.CadastroUsuario;

/**
 * Application Lifecycle Listener implementation class TestListener
 *
 */
@WebListener
public class TestListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public TestListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent e) {
    	CadastroCategoria ct=null;
    	CadastroPagina cp=null;
    	CadastroComentario cc=null;
    	CadastroUsuario cu=null;
		try {
			ct = (CadastroCategoria) CadastroFactory.get(CadastroCategoria.class);
			cp = (CadastroPagina) CadastroFactory.get(CadastroPagina.class);
			cc = (CadastroComentario) CadastroFactory.get(CadastroComentario.class);
			cu = (CadastroUsuario) CadastroFactory.get(CadastroUsuario.class);
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
    	e.getServletContext().setAttribute("CadastroCategoria", ct);
    	e.getServletContext().setAttribute("CadastroPagina", cp);
    	e.getServletContext().setAttribute("CadastroComentario", cc);
    	e.getServletContext().setAttribute("CadastroUsuario", cu);
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    }
	
}