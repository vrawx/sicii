package br.gov.sicii.dao.impl;

import br.gov.sicii.dao.interfaces.IAgenciaDAO;
import br.gov.sicii.dao.util.MontaWhere;
import br.gov.sicii.domain.Agencia;

public class AgenciaDAO extends AbstractBaseEntityDAO<Agencia> implements IAgenciaDAO{

	@Override
	protected MontaWhere consultaWhere(Agencia baseEntity) {
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
