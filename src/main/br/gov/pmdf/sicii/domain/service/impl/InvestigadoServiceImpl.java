package br.gov.pmdf.sicii.domain.service.impl;

import java.util.Date;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import br.gov.pmdf.sicii.domain.entidade.Auditoria;
import br.gov.pmdf.sicii.domain.entidade.Investigado;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioAuditoria;
import br.gov.pmdf.sicii.domain.service.InvestigadoService;

@Name("investigadoService")
@AutoCreate
public class InvestigadoServiceImpl implements InvestigadoService {
	
	@In
	private RepositorioAuditoria repositorioAuditoria;
	
	public Boolean isCandidatoValido(Investigado investigado) {
		Boolean isInvestigadoValid = true;		
		return isInvestigadoValid;		
	}
	
	public void cadastrarAuditoria(Investigado investigado, String acao) {
		repositorioAuditoria.armazenar(new Auditoria(investigado.getAlteradoPor(), acao, new Date(), investigado.getCodigoInvestigado() != null ? investigado.getCodigoInvestigado().toString()+"-"+investigado.getNome() : null));
	}
}
