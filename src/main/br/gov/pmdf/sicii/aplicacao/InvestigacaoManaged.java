package br.gov.pmdf.sicii.aplicacao;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;

import br.gov.pmdf.sicii.domain.entidade.Investigado;

@Name("investigacaoManaged")
public class InvestigacaoManaged {
	
	@In(scope=ScopeType.CONVERSATION, required=true)
	private Investigado investigado;
}
