package br.gov.pmdf.sicii.aplicacao;

import java.util.Date;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;

import br.gov.pmdf.sicii.domain.entidade.Auditoria;
import br.gov.pmdf.sicii.domain.entidade.Usuario;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioAuditoria;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioUsuario;


@Name("loginManaged")
@Scope(ScopeType.SESSION)
public class LoginManaged {

	@In @Out
	private Usuario usuario;
	
	@Out(scope=ScopeType.SESSION)
	private Usuario usuarioLogado;
		
	@In
	private RepositorioAuditoria repositorioAuditoria;
	
	@In
	private RepositorioUsuario repositorioUsuario;	
		
	public String logarSistema() {		
		usuario = repositorioUsuario.getByCredentials(usuario.getLogin(), usuario.getSenha());		
		if(usuario != null) {			
			usuario.setStatusLogin(true);
			usuarioLogado = usuario;
			// Registrando Auditoria
			repositorioAuditoria.armazenar(new Auditoria(usuario, "Logou no Sistema", new Date(), "sistema"));			
			return "sucess";			
		}	
		
		return "fail";
	}	
	public String logoutMethod() {
		return "sucess";
	}
	
	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}
	public void setUsuarioLogado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}	
}
