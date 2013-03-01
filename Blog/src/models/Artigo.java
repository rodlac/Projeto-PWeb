package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Artigo extends Pagina {
	
	@OneToMany(mappedBy="artigo",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private List<Comentario> comentarios;
	
	@ManyToOne(cascade=CascadeType.MERGE)
	private Categoria categoria;
	
	public Artigo() {
		this.comentarios = new ArrayList<Comentario>();
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}
	
	public void addComentario(Comentario comentario) {
		this.comentarios.add(comentario);
	}


	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
