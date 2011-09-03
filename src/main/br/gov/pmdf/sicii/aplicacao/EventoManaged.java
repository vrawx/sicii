package br.gov.pmdf.sicii.aplicacao;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import br.gov.pmdf.sicii.domain.entidade.Usuario;

@Name("eventoManaged")
public class EventoManaged {

	@In(scope=ScopeType.SESSION)
	private Usuario usuarioLogado;
	
	
	
	public void pesquisarEvento() {
		
	}
	
	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}
}
