package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PAGINA_ESTATICA")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class PaginaEstatica extends Pagina {
	
	@ManyToOne(fetch=FetchType.EAGER,optional=true)
	private PaginaEstatica pai;
	
	@OneToMany(mappedBy="pai",cascade=CascadeType.ALL)
	private List<PaginaEstatica> filhas;
	
	public PaginaEstatica() {}

	public PaginaEstatica getPai() {
		return pai;
	}

	public void setPai(PaginaEstatica pai) {
		this.pai = pai;
	}

	public List<PaginaEstatica> getFilhas() {
		return filhas;
	}

	public void setFilhas(List<PaginaEstatica> filhas) {
		this.filhas = filhas;
	}
	
}
