package br.gov.pmdf.sicii.domain.repositorio;

import br.gov.pmdf.sicii.domain.entidade.Endereco;

public interface RepositorioEndereco extends Repositorio<Endereco> {	
	Endereco recuperarPorFragmento(Endereco endereco);
}
