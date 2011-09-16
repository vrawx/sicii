package br.gov.pmdf.sicii.domain.service.impl;

import org.jboss.seam.annotations.Name;

import br.gov.pmdf.sicii.domain.entidade.Agencia;
import br.gov.pmdf.sicii.domain.service.AgenciaService;

@Name("agenciaService")
public class AgenciaServiceImpl implements AgenciaService {
	public Boolean isAgenciaValid(Agencia agencia) {
		return true;		
	}
}
