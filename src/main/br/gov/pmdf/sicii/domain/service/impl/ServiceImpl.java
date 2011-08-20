package br.gov.pmdf.sicii.domain.service.impl;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import br.gov.pmdf.sicii.domain.service.Service;

public abstract class ServiceImpl implements Service {
	
	// *************
	protected void generateErrorMessage(String message) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage("global", new FacesMessage());		
	}
}
