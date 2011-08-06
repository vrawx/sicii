package br.gov.sicii.dao.impl;

import br.gov.sicii.dao.interfaces.IDocumentoPesquisaDAO;
import br.gov.sicii.dao.interfaces.IEmbasamentoDAO;
import br.gov.sicii.dao.util.MontaWhere;
import br.gov.sicii.domain.DocumentoPesquisa;
import br.gov.sicii.domain.Embasamento;

public class EmbasamentoDAO extends AbstractBaseEntityDAO<Embasamento> implements RepositorioEmbasamento{
	@Override
	protected MontaWhere consultaWhere(Embasamento baseEntity) {
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
