package br.gov.pmdf.sicii.aplicacao;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;

import br.gov.pmdf.sicii.domain.entidade.Usuario;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioUsuario;

@Name("loginManaged")
@Scope(ScopeType.CONVERSATION)
public class LoginManaged {
	
	@In @Out(scope=ScopeType.SESSION)
	private Usuario usuario;
	
	@In
	private RepositorioUsuario repositorioUsuario;
	
	public boolean loginMethod() {
		usuario = repositorioUsuario.getByCredentials(usuario.getLogin(), usuario.getSenha());
		if(usuario != null)
			return true;
		return false;
	}
	
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}	
}
