package br.gov.pmdf.sicii.aplicacao;

import java.io.Serializable;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;

import br.gov.pmdf.sicii.domain.entidade.Auditoria;
import br.gov.pmdf.sicii.domain.entidade.Usuario;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioAuditoria;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioUsuario;


@Name("loginManaged")
public class LoginManaged implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@In(required=false) @Out(required=false)
	private Usuario usuario;
	
	@Out(scope=ScopeType.SESSION, required=false)
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
		FacesContext.getCurrentInstance().addMessage("loginMessage", new FacesMessage("Usuario ou Senha invalido"));		
		return "fail";
	}		
	public String logoutMethod() {		
		getUsuarioLogado().setStatusLogin(false);
		return "fail";
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
