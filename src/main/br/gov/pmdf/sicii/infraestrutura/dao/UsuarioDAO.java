package br.gov.pmdf.sicii.infraestrutura.dao;

import java.util.List;

import br.gov.pmdf.sicii.domain.entidade.Usuario;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioUsuario;

public class UsuarioDAO extends AbstractDAO<Usuario> implements RepositorioUsuario {
	
	private static final long serialVersionUID = 1L;

	public boolean validarLogin(Usuario usuario) {
		List<Usuario> usuarios = recuperarTodos();
		for (Usuario user : usuarios) {
			if( usuario.equals(user) )
				return true;
		}
		return false;		
	}
	
}
