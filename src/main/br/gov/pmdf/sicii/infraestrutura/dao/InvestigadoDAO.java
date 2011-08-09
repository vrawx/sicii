package br.gov.pmdf.sicii.infraestrutura.dao;

import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.pmdf.sicii.domain.entidade.Investigado;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioInvestigado;

@Name("repositorioInvestigado")
@AutoCreate
public class InvestigadoDAO extends AbstractDAO<Investigado> implements RepositorioInvestigado {

	private static final long serialVersionUID = 1L;

	public List<Investigado> recuperarPorFragmento(Investigado investigado) {
		String query = "FROM investigado as inv WHERE in inv.cpf LIKE :cpf AND inv.nome = :nome";
		return entityManager.createQuery(query, Investigado.class).setParameter("cpf",investigado.getCpf()).setParameter("nome", investigado.getNome()).getResultList();		
	}

	
}
