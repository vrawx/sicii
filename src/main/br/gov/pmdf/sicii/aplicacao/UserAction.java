package br.gov.pmdf.sicii.aplicacao;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;

import br.gov.pmdf.sicii.domain.entidade.Usuario;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioUsuario;

@Name("userAction")
public class UserAction {
	
	@Out(required=false)
	private Usuario usuarioLogado;
	private RepositorioUsuario repositorioUsuario;
	
	//@Restrict("#{s:hasRole('mailer')}")	
	public boolean logarSistema() {
		if(!repositorioUsuario.getByCredentials(usuarioLogado.getLogin(), usuarioLogado.getSenha()))
			return false;
		return true;
	}
}
