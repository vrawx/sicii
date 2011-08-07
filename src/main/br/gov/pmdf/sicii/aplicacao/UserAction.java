package br.gov.pmdf.sicii.aplicacao;

import javax.faces.context.FacesContext;

import org.jboss.seam.annotations.Name;

import br.gov.pmdf.sicii.domain.entidade.Usuario;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioUsuario;

@Name("userAction")
public class UserAction {
	
	private Usuario usuarioLogado;
	private RepositorioUsuario repositorioUsuario;
	
		
	public String logarSistema() {
		if(!repositorioUsuario.validarLogin(usuarioLogado))
			return "FAIL";
		return "SUCESS";
	}
}
