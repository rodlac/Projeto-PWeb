package system;

import java.util.HashMap;
import java.util.Map;

public abstract class CadastroFactory {
	public static CadastroFactory instance;
	private static Map<Class<? extends Cadastro<?>>,Cadastro<?>> store = new HashMap<Class<? extends Cadastro<?>>,Cadastro<?>>();
	
	public static Cadastro<?> get(Class<? extends Cadastro<?>> classe) throws InstantiationException, IllegalAccessException {
		if(!CadastroFactory.store.containsKey(classe)) {
			CadastroFactory.store.put(classe,classe.newInstance());
		}
		return CadastroFactory.store.get(classe);
	}
}
