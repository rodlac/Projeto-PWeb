package facades;

import models.Artigo;
import dao.DAOArtigo;

public class ArtigoFacade extends GenericFacade<Artigo>{

	public ArtigoFacade() {
		super(new DAOArtigo());
	}
}