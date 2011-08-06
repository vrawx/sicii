package br.gov.sicii.dao.impl;

import br.gov.sicii.dao.interfaces.IEventoInvestigacaoDAO;
import br.gov.sicii.dao.util.MontaWhere;
import br.gov.sicii.domain.EventoInvestigacao;

public class EventoInvestigacaoDAO extends AbstractBaseEntityDAO<EventoInvestigacao> implements RepositorioEventoInvestigacao{

	@Override
	protected MontaWhere consultaWhere(EventoInvestigacao baseEntity) {
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
