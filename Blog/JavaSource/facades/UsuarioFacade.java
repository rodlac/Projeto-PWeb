package facades;

import models.Usuario;
import dao.DAOUsuario;

public class UsuarioFacade extends GenericFacade<Usuario> {

	public UsuarioFacade() {
		super(new DAOUsuario());
		//super();
	}

}