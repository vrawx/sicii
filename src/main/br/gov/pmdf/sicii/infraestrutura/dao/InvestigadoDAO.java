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
	
	private final String packageName = Investigado.class.getPackage().getName();
	
	@SuppressWarnings("unchecked")
	public List<Investigado> recuperarPorFragmento(Investigado investigado) {		
		String stringQuery = "SELECT inv FROM "+packageName+".Investigado inv WHERE inv.cpf LIKE :cpf AND inv.nome LIKE :nome ";						
		return entityManager.createQuery(stringQuery).setParameter("cpf","%"+investigado.getCpf()+"%").setParameter("nome","%"+investigado.getNome()+"%").getResultList();				 		
	}
}
