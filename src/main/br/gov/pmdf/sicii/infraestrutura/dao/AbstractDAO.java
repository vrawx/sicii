package br.gov.pmdf.sicii.infraestrutura.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;

import org.jboss.seam.annotations.In;

import br.gov.pmdf.sicii.domain.entidade.BaseEntity;
import br.gov.pmdf.sicii.domain.repositorio.Repositorio;

public abstract class AbstractDAO<T extends BaseEntity> implements Repositorio<T> {

	private static final long serialVersionUID = 1L;

	@In
	protected EntityManager entityManager;
	
	private Class<T> persistenceClazz = null;

	
	public void armazenar(T persistenceEntity) {		
		entityManager.persist(persistenceEntity);	
		entityManager.flush();
	}
	
	public T recuperarPorId(Long id) {
		return entityManager.find(getPersistenceClass(),id);		
	}
	
	@SuppressWarnings("unchecked")
	public List<T> recuperarTodos() {		
		List<T> retorno = entityManager.createQuery("SELECT c FROM " + getPersistenceClass().getSimpleName() + " c").setMaxResults(50).getResultList();
		if (retorno.size() >= 50) {			
			System.out.println(" Quantidade de registro maior que 50 Refine sua busca");
		}
		return retorno;		
	}

	public void remover(T persistenceEntity) {		
		entityManager.remove(persistenceEntity);
		entityManager.flush();
	}
	
	@SuppressWarnings("unchecked")
	protected Class<T> getPersistenceClass() {
		if (persistenceClazz == null) {
			persistenceClazz = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		}
		return persistenceClazz;
	}		
}