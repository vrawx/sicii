package br.gov.pmdf.sicii.aplicacao;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.security.Restrict;
import org.jboss.seam.security.Credentials;
import org.jboss.seam.security.Identity;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioUsuario;

@Name("userAction")
public class UserAction  {
	
	@In Identity identity;
    @In Credentials credentials;
    
	private RepositorioUsuario repositorioUsuario;
	
	@Restrict("#{s:hasRole('AGENTE')}")	
	public void consultarConcursos() {
		
	}
}
