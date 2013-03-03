package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@MappedSuperclass
public abstract class Pagina {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int id;
	
	@Column(length=50,nullable=false)
	protected String titulo;
	
	@Column(columnDefinition="TEXT",nullable=false)
	protected String texto;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable=false,columnDefinition="DATETIME")
	protected Date data_publicacao;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	protected Date data_atualizacao;
	
	@ManyToOne(fetch=FetchType.EAGER,optional=false)
	protected UsuarioCadastrado usuario;
	
	public Pagina() {
		this.data_publicacao = new Date();
		this.data_atualizacao = new Date();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getData_publicacao() {
		return data_publicacao;
	}
	public void setData_publicacao(Date data_publicacao) {
		this.data_publicacao = data_publicacao;
	}
	public Date getData_atualizacao() {
		return data_atualizacao;
	}
	public void setData_atualizacao(Date data_atualizacao) {
		this.data_atualizacao = data_atualizacao;
	}
	public UsuarioCadastrado getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioCadastrado usuario2) {
		this.usuario = usuario2;
	}

	@Override
	public String toString() {
		return "Pagina [id=" + id + ", titulo=" + titulo + ", texto=" + texto
				+ ", data_publicacao=" + data_publicacao
				+ ", data_atualizacao=" + data_atualizacao + ", usuario="
				+ usuario + "]";
	}
	
}
