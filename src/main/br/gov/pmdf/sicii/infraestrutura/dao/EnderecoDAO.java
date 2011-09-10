package br.gov.pmdf.sicii.infraestrutura.dao;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;
import br.gov.pmdf.sicii.domain.entidade.Endereco;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioEndereco;

@Name("repositorioEndereco")
@AutoCreate
public class EnderecoDAO extends AbstractDAO<Endereco> implements RepositorioEndereco {

	private static final long serialVersionUID = 1L;

	public Endereco recuperarPorFragmento(Endereco endereco) {
		return entityManager.createQuery("", Endereco.class).getSingleResult();		
	}
}
