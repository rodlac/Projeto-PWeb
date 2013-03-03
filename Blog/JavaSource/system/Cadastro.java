package system;

import java.util.List;

import dao.DAOJPA;

@SuppressWarnings("unchecked")
public abstract class Cadastro<T> {
	
	private DAOJPA<?> dao;
	
	public Cadastro(DAOJPA<?> dao) {
		this.dao = dao;
	}
	
	public void cadastrar(T obj) {
		dao.begin();
		((DAOJPA<T>) dao).persist(obj);
		dao.commit();
		dao.close();
	}
	
	public void atualizar(T obj) {
		dao.begin();
		((DAOJPA<T>) dao).merge(obj);
		dao.commit();
		dao.close();
	}
	
	public void remover(T obj) {
		dao.begin();
		((DAOJPA<T>) dao).remove(obj);
		dao.commit();
		dao.close();
	}
	
	public T obter(int i) {
		return (T) dao.find(i);
	}
	
	public List<T> obterTodos() {
		return (List<T>) dao.findAll();
	}
}
