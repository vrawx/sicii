package br.gov.pmdf.sicii.domain.repositorio;

import br.gov.pmdf.sicii.domain.entidade.Usuario;

public interface RepositorioUsuario extends Repositorio<Usuario> {
	
	Usuario getByCredentials(String username, String password);
}
