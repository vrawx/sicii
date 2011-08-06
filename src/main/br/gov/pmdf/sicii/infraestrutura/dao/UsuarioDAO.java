package br.gov.sicii.dao.impl;

import br.gov.sicii.dao.interfaces.IUsuarioDAO;
import br.gov.sicii.dao.util.MontaWhere;
import br.gov.sicii.domain.Usuario;

public class UsuarioDAO extends AbstractBaseEntityDAO<Usuario> implements IUsuarioDAO{

	@Override
	protected MontaWhere consultaWhere(Usuario baseEntity) {
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
