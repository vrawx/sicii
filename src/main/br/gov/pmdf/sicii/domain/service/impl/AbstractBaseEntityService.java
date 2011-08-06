package br.gov.sicii.service.impl;

import java.util.List;

import br.gov.sicii.dao.interfaces.IBaseEntityDAO;
import br.gov.sicii.domain.BaseEntity;
import br.gov.sicii.service.interfaces.IBaseEntityService;

/**
 * Classe de serviço abstrata.<br>
 * Todas as classes de serviço devem derivar desta.
 * 
 * @author Nairon Nunes da Silva
 */
public abstract class AbstractBaseEntityService<B extends BaseEntity> implements IBaseEntityService<B>{

	private IBaseEntityDAO<B> dao;

	@Override
	public List<B> consultar(B baseEntity) {
		return getDao().consultar(baseEntity);
	}

	@Override
	public List<B> consultarTodos() {
		return getDao().consultarTodos();
	}

	@Override
	public B consultarPorId(Integer id) {
		return getDao().consultarPorId(id);
	}

	@Override
	public void inserir(B baseEntity){
		aplicarRegrasNegocioAntes(baseEntity);
		getDao().inserir(baseEntity);
		aplicarRegrasNegocioDepois(baseEntity);
	}

	@Override
	public void alterar(B baseEntity) {
		aplicarRegrasNegocioAntes(baseEntity);
		getDao().alterar(baseEntity);
	}

	@Override
	public void remover(B baseEntity){
		getDao().remover(baseEntity);
	}

	/**
	 * Método <u>opcional</u> responsável por aplicar regras de negócio antes de inserir ou alterar alguma entidade
	 * @param entidade
	 */
	protected void aplicarRegrasNegocioAntes(B baseEntity){

	}
	
	/**
	 * Método <u>opcional</u> responsável por aplicar regras de negócio após inserir alguma entidade
	 * @param entidade
	 */
	protected void aplicarRegrasNegocioDepois(B baseEntity){

	}
	
	public IBaseEntityDAO<B> getDao() {
		return dao;
	}

	public void setDao(IBaseEntityDAO<B> dao) {
		this.dao = dao;
	}
}
