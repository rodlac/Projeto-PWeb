package system;

import java.util.Iterator;

public interface Cadastro<T> {
	public Cadastro<T> getInstance();
	public void cadastrar(T obj);
	public T obter(int i);
	public void remover(T obj);
	public void atualizar(T obj);
	public Iterator<T> iterator();
}
