package br.gov.pmdf.sicii.infraestrutura.dao;

import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.pmdf.sicii.domain.entidade.Investigacao;
import br.gov.pmdf.sicii.domain.entidade.Investigado;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioInvestigacao;

@Name("repositorioInvestigacao")
@AutoCreate
public class InvestigacaoDAO extends AbstractDAO<Investigacao> implements RepositorioInvestigacao {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public List<Investigacao> recuperarInvestigacoesInvestigado(Investigado investigado) {
		String query = "SELECT inv FROM Investigacao inv WHERE inv.investigados.codigoInvestigado == investigado.codigoInvestigado";		
		return entityManager.createQuery(query).getResultList();		
	}
}
