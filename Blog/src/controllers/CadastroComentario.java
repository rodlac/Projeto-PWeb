package controllers;

import models.Comentario;
import system.Cadastro;
import dao.DAOComentario;

public class CadastroComentario extends Cadastro<Comentario> {

	public CadastroComentario() {
		super(new DAOComentario());
	}

}