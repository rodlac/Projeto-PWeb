package app;

import models.Categoria;
import dao.DAOCategoria;

public class Aplicacao1 {
	
	private DAOCategoria dao = new DAOCategoria();
	
	public Aplicacao1() {}
	
	public void cadastrarCategoria() {
		dao.begin();
		Categoria c1 = new Categoria();
		c1.setNome("Teste");
		c1.setDescricao("Testando");
		
		Categoria c2 = new Categoria();
		c2.setNome("Teste2");
		c2.setDescricao("Testando1");
		c2.setPai(c1);
		
		dao.persist(c1);
		dao.persist(c2);
		dao.commit();
		dao.close();
	}
	
	public static void main(String[] args) {
		Aplicacao1 app = new Aplicacao1();
		app.cadastrarCategoria();
	}
}
