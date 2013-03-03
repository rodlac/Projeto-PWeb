package models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorValue("C")
public class UsuarioCadastrado extends Usuario {
	
	@Column(length=8,nullable=false)
	private String login;
	
	@Column(length=32,nullable=false)
	private String senha;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date data_registro;
	
	@OneToMany(mappedBy="usuario",cascade=CascadeType.ALL)
	private List<Pagina> paginas;
	
	public UsuarioCadastrado() {
		this.data_registro = new Date();
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Date getData_registro() {
		return data_registro;
	}
	public void setData_registro(Date data_registro) {
		this.data_registro = data_registro;
	}
}
