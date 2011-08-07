package br.gov.sicii.dao.impl;

import br.gov.sicii.dao.interfaces.IFuncaoUsuarioDAO;
import br.gov.sicii.dao.interfaces.IInvestigacaoDAO;
import br.gov.sicii.dao.util.MontaWhere;
import br.gov.sicii.domain.FuncaoUsuario;
import br.gov.sicii.domain.Investigacao;

public class InvestigacaoDAO extends AbstractBaseEntityDAO<Investigacao> implements RepositorioInvestigacao{

	@Override
	protected MontaWhere consultaWhere(Investigacao baseEntity) {
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