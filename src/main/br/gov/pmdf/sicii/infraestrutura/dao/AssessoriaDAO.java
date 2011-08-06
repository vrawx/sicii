package br.gov.sicii.dao.impl;

import br.gov.sicii.dao.interfaces.IAgenciaDAO;
import br.gov.sicii.dao.interfaces.IAssessoriaDAO;
import br.gov.sicii.dao.util.MontaWhere;
import br.gov.sicii.domain.Agencia;
import br.gov.sicii.domain.Assessoria;

public class AssessoriaDAO extends AbstractBaseEntityDAO<Assessoria> implements IAssessoriaDAO{

	@Override
	protected MontaWhere consultaWhere(Assessoria baseEntity) {
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
