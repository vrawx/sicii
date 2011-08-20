package br.gov.pmdf.sicii.domain.service.impl;

import org.jboss.seam.annotations.In;

import br.gov.pmdf.sicii.domain.entidade.Investigado;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioInvestigado;
import br.gov.pmdf.sicii.domain.service.Service;

public class InvestigadoService implements Service {
	
	@In
	private RepositorioInvestigado repositorioInvestigado;
	
	public void aplicarRegradeNegocio(Investigado investigado) {		
		
	}
}
