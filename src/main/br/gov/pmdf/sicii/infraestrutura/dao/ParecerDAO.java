package br.gov.sicii.dao.impl;

import br.gov.sicii.dao.interfaces.IParecerDAO;
import br.gov.sicii.dao.interfaces.IPesquisaDAO;
import br.gov.sicii.dao.util.MontaWhere;
import br.gov.sicii.domain.Parecer;
import br.gov.sicii.domain.Pesquisa;

public class ParecerDAO extends AbstractBaseEntityDAO<Parecer> implements IParecerDAO{

	@Override
	protected MontaWhere consultaWhere(Parecer baseEntity) {
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

}
