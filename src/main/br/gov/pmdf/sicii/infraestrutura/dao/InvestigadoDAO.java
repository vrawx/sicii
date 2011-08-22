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
			
	@SuppressWarnings("unchecked")
	public List<Investigado> recuperarPorFragmento(Investigado investigado) {				
		String stringQuery = "SELECT inv FROM INVESTIGADO inv";
		return entityManager.createQuery(stringQuery).getResultList();
		//String stringQuery = "SELECT inv FROM investigado inv WHERE inv.cpf LIKE '%:cpf%' ";				
		//return entityManager.createQuery(stringQuery, Investigado.class).setParameter("cpf",investigado.getCpf()).getResultList();				 		
	}	
}
