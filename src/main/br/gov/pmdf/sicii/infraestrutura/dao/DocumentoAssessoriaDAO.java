package br.gov.sicii.dao.impl;

import br.gov.sicii.dao.interfaces.IDocumentoAssessoriaDAO;
import br.gov.sicii.dao.util.MontaWhere;
import br.gov.sicii.domain.DocumentoAssessoria;

public class DocumentoAssessoriaDAO extends AbstractBaseEntityDAO<DocumentoAssessoria> implements RepositorioDocumentoAssessoria{

	@Override
	protected MontaWhere consultaWhere(DocumentoAssessoria baseEntity) {
		MontaWhere consulta = new MontaWhere();
		
		if(baseEntity.getId() != null){
			consulta.addQuery(" and entidade.id = :id");
			consulta.addParametro("id", baseEntity.getId());
		}
		if(!StringUtil.isVazia(baseEntity.getDescricao())){
			consulta.addQuery(" and entidade.descricao = :desc");
			consulta.addParametro("desc", baseEntity.getDescricao());
		}
		
		return consulta;
	}
}
