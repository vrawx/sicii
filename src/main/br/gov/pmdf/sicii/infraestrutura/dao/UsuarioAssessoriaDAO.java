package br.gov.sicii.dao.impl;

import br.gov.sicii.dao.interfaces.IInvestigacaoDAO;
import br.gov.sicii.dao.interfaces.IInvestigadoDAO;
import br.gov.sicii.dao.interfaces.ISituacaoDAO;
import br.gov.sicii.dao.interfaces.IUsuarioAssessoriaDAO;
import br.gov.sicii.dao.util.MontaWhere;
import br.gov.sicii.domain.Investigacao;
import br.gov.sicii.domain.Investigado;
import br.gov.sicii.domain.Situacao;
import br.gov.sicii.domain.UsuarioAssessoria;

public class UsuarioAssessoriaDAO extends AbstractBaseEntityDAO<UsuarioAssessoria> implements RepositorioUsuarioAssessoria{
	@Override
	protected MontaWhere consultaWhere(UsuarioAssessoria baseEntity) {
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
