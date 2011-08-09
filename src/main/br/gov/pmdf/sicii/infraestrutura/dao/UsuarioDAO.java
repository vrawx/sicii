package br.gov.pmdf.sicii.infraestrutura.dao;

import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.pmdf.sicii.domain.entidade.Usuario;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioUsuario;

@Name("repositorioUsuario")
@AutoCreate
public class UsuarioDAO extends AbstractDAO<Usuario> implements RepositorioUsuario {
	
	private static final long serialVersionUID = 1L;

	public Usuario getByCredentials(String username, String password) {
		//List<Usuario> usuarios = recuperarTodos();
		String query = "FROM USUARIO WHERE login = :login AND senha = :senha ";
		List<Usuario> users = (List<Usuario>) entityManager.createQuery(query, Usuario.class).setParameter("login",username).setParameter("senha",password).getResultList();
		Usuario usuario = new Usuario(username, password);		
		for (Usuario user : users) {
			if(usuario.equals(user) )
				return user;
		}
		return null;
	}

	
}
