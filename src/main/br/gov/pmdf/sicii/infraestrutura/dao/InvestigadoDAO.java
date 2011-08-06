package br.gov.sicii.dao.impl;

import br.gov.sicii.dao.interfaces.IInvestigacaoDAO;
import br.gov.sicii.dao.interfaces.IInvestigadoDAO;
import br.gov.sicii.dao.util.MontaWhere;
import br.gov.sicii.domain.Investigacao;
import br.gov.sicii.domain.Investigado;

public class InvestigadoDAO extends AbstractBaseEntityDAO<Investigado> implements IInvestigadoDAO{

	@Override
	protected MontaWhere consultaWhere(Investigado baseEntity) {
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
