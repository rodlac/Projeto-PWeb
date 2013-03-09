package facades;

import models.PaginaEstatica;
import dao.DAOPaginaEstatica;

public class PaginaFacade extends GenericFacade<PaginaEstatica> {

	public PaginaFacade() {
		super(new DAOPaginaEstatica());
	}

}