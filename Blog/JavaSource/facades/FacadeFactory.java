package facades;

import java.util.HashMap;
import java.util.Map;

public abstract class FacadeFactory {
	public static FacadeFactory instance;
	private static Map<Class<? extends GenericFacade<?>>,GenericFacade<?>> store = new HashMap<Class<? extends GenericFacade<?>>,GenericFacade<?>>();
	
	public static GenericFacade<?> get(Class<? extends GenericFacade<?>> classe) throws InstantiationException, IllegalAccessException {
		if(!FacadeFactory.store.containsKey(classe)) {
			FacadeFactory.store.put(classe,classe.newInstance());
		}
		return FacadeFactory.store.get(classe);
	}
}
