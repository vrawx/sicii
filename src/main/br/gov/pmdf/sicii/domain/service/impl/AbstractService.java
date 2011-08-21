package br.gov.pmdf.sicii.domain.service.impl;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import br.gov.pmdf.sicii.domain.entidade.BaseEntity;
import br.gov.pmdf.sicii.domain.service.Service;

public abstract class AbstractService<B extends BaseEntity> implements Service<B> {
	
	// *************
	protected void generateErrorMessage(String message) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage("global", new FacesMessage());		
	}
}
