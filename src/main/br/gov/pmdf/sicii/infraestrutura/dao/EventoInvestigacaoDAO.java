package br.gov.pmdf.sicii.infraestrutura.dao;

import java.util.List;

import javax.persistence.NamedQuery;
import javax.persistence.Query;

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
//		String query = "SELECT evento FROM "+packageName+".EventoInvestigacao evento where evento.codigoEvento =:codigoEvento "+
//				"AND evento.numeroEvento =:numeroEvento AND evento.ano =:ano ";			
//		return entityManager.createQuery(query).setParameter("numeroEvento",eventoInvestigacao.getNumeroEvento()).setParameter("codigoEvento",eventoInvestigacao.getCodigoEvento()).setParameter("ano",eventoInvestigacao.getAno()).getResultList();
		
		StringBuilder stringQuery = new StringBuilder();
		stringQuery.append("SELECT evento FROM "+packageName+".EventoInvestigacao evento where 1=1 ");		
		
		Query query = entityManager.createQuery(stringQuery.toString());			
				
		if(eventoInvestigacao.getCodigoEvento() != null) {
			stringQuery.append("and evento.codigoEvento =:codigo ");
			query.setParameter("codigo", eventoInvestigacao.getCodigoEvento());
		}
		if(eventoInvestigacao.getNumeroEvento() != null) {
			stringQuery.append("and evento.numeroEvento =:numero ");
			query.setParameter("numero", eventoInvestigacao.getNumeroEvento());
		}
		if(eventoInvestigacao.getAno() != null) {
			stringQuery.append("and evento.ano =:ano ");
			System.out.println(eventoInvestigacao.getAno());
			query.setParameter("ano", eventoInvestigacao.getAno());
		}
		if(!eventoInvestigacao.getDescricao().isEmpty()) {
			stringQuery.append("and evento.descricao LIKE :descricao ");
			query.setParameter("descricao", eventoInvestigacao.getDescricao());
		}		
		return 	query.getResultList();
	}	
}
