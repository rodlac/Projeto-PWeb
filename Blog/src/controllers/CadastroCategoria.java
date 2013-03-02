package controllers;

import java.util.List;

import models.Categoria;
import system.Cadastro;
import dao.DAOCategoria;

public class CadastroCategoria implements Cadastro<Categoria> {
	private static CadastroCategoria instance=null;
	private DAOCategoria dao;
	
	private CadastroCategoria() {
		dao = new DAOCategoria();
	}
	
	public static CadastroCategoria getInstance() {
		if(CadastroCategoria.instance == null)
			CadastroCategoria.instance = new CadastroCategoria();
		return CadastroCategoria.instance;
	}
	
	@Override
	public void cadastrar(Categoria obj) {
		dao.begin();		
		dao.persist(obj);		
		dao.commit();
		dao.close();
	}
	
	@Override
	public Categoria obter(int i) {
		return dao.find(i);
	}
	@Override
	public void remover(Categoria obj) {
		dao.begin();		
		dao.remove(obj);		
		dao.commit();
		dao.close();		
	}
	@Override
	public void atualizar(Categoria obj) {
		dao.begin();		
		dao.merge(obj);		
		dao.commit();
		dao.close();		
	}

	@Override
	public List<Categoria> obterTodos() {
		return dao.findAll();
	}
}
