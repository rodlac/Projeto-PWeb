package system;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import facades.ArtigoFacade;
import facades.FacadeFactory;
import facades.CategoriaFacade;
import facades.ComentarioFacade;
import facades.PaginaFacade;
import facades.UsuarioFacade;


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
    	CategoriaFacade ct=null;
    	PaginaFacade cp=null;
    	ArtigoFacade ca=null;
    	ComentarioFacade cc=null;
    	UsuarioFacade cu=null;
		try {
			ct = (CategoriaFacade) FacadeFactory.get(CategoriaFacade.class);
			cp = (PaginaFacade) FacadeFactory.get(PaginaFacade.class);
			cc = (ComentarioFacade) FacadeFactory.get(ComentarioFacade.class);
			cu = (UsuarioFacade) FacadeFactory.get(UsuarioFacade.class);
			ca = (ArtigoFacade) FacadeFactory.get(ArtigoFacade.class);
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
    	e.getServletContext().setAttribute("CadastroArtigo",ca);
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    }
	
}