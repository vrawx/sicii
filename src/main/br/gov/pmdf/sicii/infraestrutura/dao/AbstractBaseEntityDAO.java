package br.gov.sicii.dao.impl;

import java.util.List;

import br.gov.sicii.dao.interfaces.IBaseEntityDAO;
import br.gov.sicii.dao.util.MontaWhere;
import br.gov.sicii.domain.BaseEntity;

public abstract class AbstractBaseEntityDAO<B extends BaseEntity> implements IBaseEntityDAO<B> {

	private Class<B> persistentClass;
	private Session sessao;

	public AbstractBaseEntityDAO() {
		this.setPersistentClass((Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
	}

	protected abstract MontaWhere consultaWhere(B baseEntity);
	
	public void inserir(B baseEntity) {
		iniciarSessao();
		getSessao().save(baseEntity);
		commit();
	};
	
	public void alterar(B baseEntity) {
		iniciarSessao();
		getSessao().update(baseEntity);
		commit();
	};
	
	public void remover(B baseEntity) {
		iniciarSessao();
		getSessao().delete(baseEntity);
		commit();
	};

	public List<B> consultar(B baseEntity) {
		MontaWhere where = consultaWhere(baseEntity);
		String strQuery = new String("from " + getPersistentClass().getName() + " entidade where 1=1" + where.getQuery());
		iniciarSessao();
		Query query = getSessao().createQuery(strQuery);
		while(!where.isEmpty()){
			String nomeParametro = where.getNomeProximoParametro();
			query.setParameter(nomeParametro, where.getParametro(nomeParametro));
		}
		List<B> result = query.list();
		getSessao().close();
		return result;
	};
	
	@Override
	public B consultarPorId(Integer id) {
		iniciarSessao();
		E entidade = (B) getSessao().get(getPersistentClass(), id);
		getSessao().close();
		return entidade;
	}
	
	@Override
	public List<B> consultarTodos() {
		iniciarSessao();
		List<B> result = getSessao().createQuery("from "+getPersistentClass().getName()).list();
		getSessao().close();
		return result;
	}

	protected void iniciarSessao() throws HibernateException{
		sessao = HibernateUtil.getSessao();
		sessao.beginTransaction();
	}

	protected void commit() throws HibernateException{
		getSessao().getTransaction().commit();
	}

	protected Session getSessao(){
		return this.sessao;
	}

	private void setPersistentClass(Class<B> persistentClass) {
		this.persistentClass = persistentClass;
	}

	private Class<B> getPersistentClass() {
		return persistentClass;
	}	
}