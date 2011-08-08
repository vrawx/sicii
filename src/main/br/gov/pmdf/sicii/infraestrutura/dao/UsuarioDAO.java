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

	public boolean getByCredentials(String username, String password) {
		List<Usuario> usuarios = recuperarTodos();
		//List<Usuario> users = (List<Usuario>) entityManager.createQuery("", Usuario.class);
		Usuario usuario = new Usuario(username, password);		
		for (Usuario user : usuarios) {
			if(usuario.equals(user) )
				return true;
		}
		return false;
	}

	
}
