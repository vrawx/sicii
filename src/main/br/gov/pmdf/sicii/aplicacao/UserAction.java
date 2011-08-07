package br.gov.pmdf.sicii.aplicacao;

import org.jboss.seam.annotations.Name;

import br.gov.pmdf.sicii.domain.entidade.Usuario;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioUsuario;

@Name("userAction")
public class UserAction {
	
	private Usuario usuarioLogado;
	private RepositorioUsuario repositorioUsuario;
	
		
	public boolean logarSistema() {
		
		
		return true;
	}
}
