package app;

import java.util.Iterator;

import models.Artigo;
import models.Categoria;
import models.UsuarioCadastrado;
import system.CadastroFactory;
import controllers.CadastroCategoria;
import controllers.CadastroComentario;
import controllers.CadastroPagina;
import controllers.CadastroUsuario;

public class Aplicacao1 {
	
	private CadastroCategoria ct;
	private CadastroUsuario cu;
	private CadastroPagina cp;
	private CadastroComentario cc;
	
	public Aplicacao1() {		
		try {
			ct = (CadastroCategoria) CadastroFactory.get(CadastroCategoria.class);
			cu = (CadastroUsuario) CadastroFactory.get(CadastroUsuario.class);
			cp = (CadastroPagina) CadastroFactory.get(CadastroPagina.class);
			cc = (CadastroComentario) CadastroFactory.get(CadastroComentario.class);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void cadastrarCategoria() {
		Categoria c1 = new Categoria();
		c1.setNome("Teste1");
		c1.setDescricao("Testando3");
		
		Categoria c2 = new Categoria();
		c2.setNome("Teste2");
		c2.setDescricao("Testando1");
		c2.setPai(c1);
		
		ct.cadastrar(c1);
		ct.cadastrar(c2);
		
		//ct.cadastrar(c1);
	}
	
	public void cadastrarUsuario() {
		UsuarioCadastrado u1 = new UsuarioCadastrado();
		u1.setNome("Rodrigo");
		u1.setEmail("contato@rodlac.com.br");
		u1.setLogin("rodlac");
		u1.setSenha("teste");
		
		cu.cadastrar(u1);
		
	}
	
	public void cadastrarPagina() {
		Artigo a1 = new Artigo();
		a1.setCategoria(ct.obter(1));
		a1.setTitulo("Testando");
		a1.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas tristique lectus eu dolor lacinia hendrerit sed vitae urna. Cras lacinia, nisi ut euismod rutrum, arcu est porttitor dui, eget pretium tellus tellus tincidunt urna. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Morbi tincidunt dolor quis velit venenatis dignissim. Sed hendrerit, ipsum sit amet adipiscing euismod, mauris odio euismod nisl, ut vestibulum purus ipsum non augue. Integer commodo felis vel tortor placerat sollicitudin. Curabitur lectus quam, suscipit ac feugiat sed, bibendum vitae ligula. Quisque non ornare eros. Curabitur rhoncus nunc placerat lacus laoreet ultrices.");
		a1.setUsuario((UsuarioCadastrado) cu.obter(1));
		
		cp.cadastrar(a1);
	}
	
	public void listarCategorias() {
		System.out.println(ct.obter(1));
		Iterator<Categoria> it = ct.obterTodos().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public void cadastrarComentario() {
		//Comentario c1 = new Comentario();
		//c1.set
	}
	
	public static void main(String[] args) {
		Aplicacao1 app = new Aplicacao1();
		//app.cadastrarUsuario();
		app.cadastrarCategoria();
		//app.cadastrarPagina();
		app.listarCategorias();
	}
}
