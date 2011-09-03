package br.gov.pmdf.sicii.domain.service.impl;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import br.gov.pmdf.sicii.domain.entidade.Investigado;
import br.gov.pmdf.sicii.domain.service.InvestigadoService;


public class InvestigadoServiceImpl implements InvestigadoService {
	
	public Boolean isCandidatoValido(Investigado investigado) {
		Boolean isInvestigadoValid = true;
		FacesContext.getCurrentInstance().addMessage("global",new FacesMessage("Usuario Cadastrado"));
		return isInvestigadoValid;		
	}
}
