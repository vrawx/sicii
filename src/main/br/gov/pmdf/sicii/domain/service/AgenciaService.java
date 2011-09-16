package br.gov.pmdf.sicii.domain.service;

import br.gov.pmdf.sicii.domain.entidade.Agencia;

public interface AgenciaService extends Service<Agencia> {
	Boolean isAgenciaValid(Agencia agenciaInvestigacao);
}
