package br.gov.pmdf.sicii.domain.service;

import br.gov.pmdf.sicii.domain.entidade.BaseEntity;

public interface Service<B extends BaseEntity> {
	
	public void cadastrarAuditoria(B baseEntity, String acao);
	
	//void generateErrorMessage(String message);
}
