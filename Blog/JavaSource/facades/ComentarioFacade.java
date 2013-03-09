package facades;

import models.Comentario;
import dao.DAOComentario;

public class ComentarioFacade extends GenericFacade<Comentario> {

	public ComentarioFacade() {
		super(new DAOComentario());
		//super();
	}

}