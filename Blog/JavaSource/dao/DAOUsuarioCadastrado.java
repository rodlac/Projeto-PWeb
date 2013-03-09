package dao;

import javax.persistence.NoResultException;

import models.UsuarioCadastrado;

public class DAOUsuarioCadastrado extends DAOJPA<UsuarioCadastrado> {
	public DAOUsuarioCadastrado(){
		super();
	}
	
	
	public UsuarioCadastrado findByCredentials(String login,String senha){
		try {
			return super.getManager().createQuery("SELECT u FROM UsuarioCadastrado u WHERE (u.login LIKE :login OR u.email LIKE :email) AND u.senha LIKE :senha",UsuarioCadastrado.class)
					.setParameter("login",login)
					.setParameter("email", login)
					.setParameter("senha",senha)
					.getSingleResult();
		} catch(NoResultException e) {
			return null;
		}
				
    }
}
