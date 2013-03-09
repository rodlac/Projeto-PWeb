package facades;

import models.Categoria;
import dao.DAOCategoria;

public class CategoriaFacade extends GenericFacade<Categoria> {
	public CategoriaFacade() {
		super(new DAOCategoria());
	}
}