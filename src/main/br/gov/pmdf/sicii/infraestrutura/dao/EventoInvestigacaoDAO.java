package br.gov.pmdf.sicii.infraestrutura.dao;

import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.pmdf.sicii.domain.entidade.EventoInvestigacao;
import br.gov.pmdf.sicii.domain.entidade.Investigado;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioEventoInvestigacao;

@Name("repositorioEventoInvestigacao")
@AutoCreate
public class EventoInvestigacaoDAO extends AbstractDAO<EventoInvestigacao> implements RepositorioEventoInvestigacao {

	private static final long serialVersionUID = 1L;

	private final String packageName = Investigado.class.getPackage().getName();

	@SuppressWarnings("unchecked")
	public List<EventoInvestigacao> recuperarPorFragmento(EventoInvestigacao eventoInvestigacao) {
		String query = "SELECT evento FROM "+packageName+".EventoInvestigacao evento";
		return entityManager.createQuery(query).getResultList();
	}
	
	
	
}
