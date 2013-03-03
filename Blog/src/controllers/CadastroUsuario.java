package controllers;

import models.Usuario;
import system.Cadastro;
import dao.DAOUsuario;

public class CadastroUsuario extends Cadastro<Usuario> {

	public CadastroUsuario() {
		super(new DAOUsuario());
	}

}