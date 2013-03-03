package controllers;

import models.Categoria;
import system.Cadastro;
import dao.DAOCategoria;

public class CadastroCategoria extends Cadastro<Categoria> {
	public CadastroCategoria() {
		super(new DAOCategoria());
	}

}