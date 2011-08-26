package br.gov.pmdf.sicii.aplicacao;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;

import br.gov.pmdf.sicii.domain.entidade.Usuario;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioUsuario;

@Name("loginManaged")
public class LoginManaged {

	@In @Out
	private Usuario usuario;
	
//	@Out(scope=ScopeType.SESSION)
//	private Usuario usuarioLogado;
	
	@In
	private RepositorioUsuario repositorioUsuario;	
		
	public String loginMethod() {		
		usuario = repositorioUsuario.getByCredentials(usuario.getLogin(), usuario.getSenha());		
		if(usuario != null) {
			usuario.setStatusLogin(true);
			return "sucess";			
		}		
		return "fail";
	}	
	public void logoutMethod() {

	}
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}	
}
