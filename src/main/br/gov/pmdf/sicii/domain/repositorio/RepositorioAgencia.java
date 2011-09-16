package br.gov.pmdf.sicii.domain.repositorio;

import java.util.List;

import br.gov.pmdf.sicii.domain.entidade.Agencia;


public interface RepositorioAgencia extends Repositorio<Agencia> {

	List<Agencia> recuperarPorFragmento(Agencia agencia); 
}
