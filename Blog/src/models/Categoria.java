package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Categoria {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length=20)
	private String nome;
	
	@Column(length=50)
	private String descricao;
	
	@OneToMany(mappedBy="categoria",cascade=CascadeType.ALL)
	private List<Artigo> artigos;
	
	@ManyToOne(fetch=FetchType.EAGER,optional=true)
	private Categoria pai;
	
	@OneToMany(mappedBy="pai",cascade=CascadeType.MERGE)
	private List<Categoria> filhas;
	
	public Categoria() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Categoria getPai() {
		return pai;
	}
	public void setPai(Categoria pai) {
		this.pai = pai;
	}

	public List<Artigo> getArtigos() {
		return artigos;
	}

	public void setArtigos(List<Artigo> artigos) {
		this.artigos = artigos;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nome=" + nome + ", descricao="
				+ descricao + ", artigos=" + artigos + ", pai=" + pai
				+ ", filhas=" + filhas + "]";
	}
	
}
