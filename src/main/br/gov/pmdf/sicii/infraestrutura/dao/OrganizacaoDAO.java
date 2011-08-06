package br.gov.sicii.dao.impl;

import br.gov.sicii.dao.interfaces.IOrganizacaoDAO;
import br.gov.sicii.dao.util.MontaWhere;
import br.gov.sicii.domain.Organizacao;
import br.gov.sicii.domain.Pesquisa;

public class OrganizacaoDAO extends AbstractBaseEntityDAO<Organizacao> implements RepositorioOrganizacao{

	@Override
	protected MontaWhere consultaWhere(Pesquisa baseEntity) {
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
