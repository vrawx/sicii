
package br.gov.pmdf.sicii.domain.repositorio;

import java.io.Serializable;
import java.util.List;

import br.gov.pmdf.sicii.domain.entidade.BaseEntity;

public interface Repositorio<T extends BaseEntity> extends Serializable{

	void armazenar(T persistenceEntity);
	
	T recuperarPorId(Long id);
	
	// Este método deve lancar uma exception ao retornar mais de 50 results	
	List<T> recuperarTodos();
	
	void remover(T persistenceEntity);
	
	void refresh(T persistenceEntity);
}
