package controllers;

import java.util.List;

import models.Usuario;
import system.Cadastro;
import dao.DAOUsuario;

public class CadastroUsuario implements Cadastro<Usuario> {
	private static CadastroUsuario instance=null;
	private DAOUsuario dao;
	
	private CadastroUsuario() {
		dao = new DAOUsuario();
	}
	
	public static CadastroUsuario getInstance() {
		if(CadastroUsuario.instance == null)
			CadastroUsuario.instance = new CadastroUsuario();
		return CadastroUsuario.instance;
	}
	
	@Override
	public void cadastrar(Usuario obj) {
		dao.begin();		
		dao.persist(obj);		
		dao.commit();
		dao.close();
	}
	
	@Override
	public Usuario obter(int i) {
		return dao.find(i);
	}
	@Override
	public void remover(Usuario obj) {
		dao.begin();		
		dao.remove(obj);		
		dao.commit();
		dao.close();		
	}
	@Override
	public void atualizar(Usuario obj) {
		dao.begin();		
		dao.merge(obj);		
		dao.commit();
		dao.close();		
	}

	@Override
	public List<Usuario> obterTodos() {
		return dao.findAll();
	}
}
