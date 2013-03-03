package system;

import java.util.List;

import dao.DAOJPA;

//@SuppressWarnings("unchecked")
public abstract class Cadastro<T> {
	
	private DAOJPA<?> dao;
	/*private List<T> lista;
	
	public Cadastro() {
		this.lista = new ArrayList<T>();
	}
	
	public void cadastrar(T obj) {
		this.lista.add(obj);
	}
	
	public void atualizar(T obj) {
		//this.lista.
	}
	
	public void remover(T obj) {
		this.lista.remove(obj);
	}
	
	public T obter(int i) {
		return this.lista.get(i);
	}
	
	public List<T> obterTodos() {
		return this.lista;
	}*/
	
	
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
