package controllers;

import models.Pagina;
import system.Cadastro;
import dao.DAOPagina;

public class CadastroPagina extends Cadastro<Pagina> {

	public CadastroPagina() {
		super(new DAOPagina());
	}

}