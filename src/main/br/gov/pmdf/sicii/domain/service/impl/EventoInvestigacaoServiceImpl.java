package br.gov.pmdf.sicii.domain.service.impl;

import org.jboss.seam.annotations.Name;

import br.gov.pmdf.sicii.domain.entidade.EventoInvestigacao;
import br.gov.pmdf.sicii.domain.service.EventoInvestigacaoService;

@Name("eventoInvestigacaoService")
public class EventoInvestigacaoServiceImpl implements EventoInvestigacaoService {
	public Boolean isEventoInvestigacaoValid(EventoInvestigacao eventoInvestigacao) {
		return true;		
	}
}
