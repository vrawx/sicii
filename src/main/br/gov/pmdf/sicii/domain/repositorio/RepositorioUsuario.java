package br.gov.pmdf.sicii.domain.repositorio;

import br.gov.pmdf.sicii.domain.entidade.Usuario;

public interface RepositorioUsuario extends Repositorio<Usuario> {
	
	boolean getByCredentials(String username, String password);
}
