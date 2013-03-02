package controllers;

import java.util.List;

import models.Comentario;
import system.Cadastro;
import dao.DAOComentario;

public class CadastroComentario implements Cadastro<Comentario> {
	private static CadastroComentario instance=null;
	private DAOComentario dao;
	
	private CadastroComentario() {
		dao = new DAOComentario();
	}
	
	public static CadastroComentario getInstance() {
		if(CadastroComentario.instance == null)
			CadastroComentario.instance = new CadastroComentario();
		return CadastroComentario.instance;
	}
	
	@Override
	public void cadastrar(Comentario obj) {
		dao.begin();		
		dao.persist(obj);		
		dao.commit();
		dao.close();
	}
	
	@Override
	public Comentario obter(int i) {
		return dao.find(i);
	}
	@Override
	public void remover(Comentario obj) {
		dao.begin();		
		dao.remove(obj);		
		dao.commit();
		dao.close();		
	}
	@Override
	public void atualizar(Comentario obj) {
		dao.begin();		
		dao.merge(obj);		
		dao.commit();
		dao.close();		
	}

	@Override
	public List<Comentario> obterTodos() {
		return dao.findAll();
	}
}
