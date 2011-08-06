package br.gov.sicii.dao.impl;

import br.gov.sicii.dao.interfaces.IDocumentoDAO;
import br.gov.sicii.dao.util.MontaWhere;
import br.gov.sicii.domain.Assessoria;
import br.gov.sicii.domain.Documento;

public class DocumentoDAO extends AbstractBaseEntityDAO<Documento> implements RepositorioDocumento{

	@Override
	protected MontaWhere consultaWhere(Documento baseEntity) {
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
