package controllers;

import java.util.List;

import system.Cadastro;

import models.Pagina;
import dao.DAOPagina;

public class CadastroPagina implements Cadastro<Pagina> {

	private static CadastroPagina instance=null;
	private DAOPagina dao;
	
	private CadastroPagina() {
		this.dao = new DAOPagina();
	}
	
	public static CadastroPagina getInstance() {
		if(CadastroPagina.instance == null)
			CadastroPagina.instance = new CadastroPagina();
		return CadastroPagina.instance;
	}

	@Override
	public void cadastrar(Pagina obj) {
		dao.begin();
		dao.persist(obj);
		dao.commit();
		dao.close();		
	}

	@Override
	public Pagina obter(int i) {
		return dao.find(i);
	}

	@Override
	public void remover(Pagina obj) {
		dao.begin();
		dao.remove(obj);		
		dao.commit();
		dao.close();		
	}
	
	public List<Pagina> findAll() {
		return dao.findAll();
	}

	@Override
	public void atualizar(Pagina obj) {
		dao.begin();
		dao.merge(obj);
		dao.commit();
		dao.close();		
	}

	@Override
	public List<Pagina> obterTodos() {
		return dao.findAll();
	}
	
	
}
