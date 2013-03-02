package system;

import java.util.List;

public interface Cadastro<T> {
	
	public void cadastrar(T obj);
	public void remover(T obj);
	public void atualizar(T obj);
	public T obter(int id);
	public List<T> obterTodos();

}
