package br.gov.pmdf.sicii.aplicacao;

import java.util.List;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.annotations.security.Restrict;
import br.gov.pmdf.sicii.domain.entidade.Investigado;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioInvestigado;


@Name("investigadoManaged")
@Scope(ScopeType.CONVERSATION)
public class InvestigadoManaged  {
	
	@Out
	private Investigado investigado;
		
	private List<Investigado> investigadosConsultados;
	
	@In
	private RepositorioInvestigado repositorioInvestigado;	
	
	@Restrict("#{s:hasRole('ADMINISTRADOR')}")
	public void pesquisarInvestigado() {
		investigadosConsultados = repositorioInvestigado.recuperarPorFragmento(investigado);		
	}
			
	
	

	public List<Investigado> getInvestigadosConsultados() {
		return investigadosConsultados;
	}
}
