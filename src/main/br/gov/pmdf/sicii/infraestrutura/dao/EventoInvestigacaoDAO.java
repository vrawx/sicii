package br.gov.pmdf.sicii.infraestrutura.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
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
		
		Session ss = (Session)entityManager.getDelegate(); 
		Criteria select = ss.createCriteria(EventoInvestigacao.class);
		
		if(eventoInvestigacao.getCodigoEvento() != null) {
			select.add( Restrictions.eq("codigoEvento",eventoInvestigacao.getCodigoEvento()));
		}
		if(eventoInvestigacao.getNumeroEvento() != null) {
			select.add( Restrictions.eq("numeroEvento",eventoInvestigacao.getNumeroEvento()));
		}
		if(eventoInvestigacao.getAno() != null) {
			select.add( Restrictions.eq("ano",eventoInvestigacao.getAno()));
		}
		if(!eventoInvestigacao.getDescricao().isEmpty()) {
			select.add( Restrictions.like("descricao", "%"+eventoInvestigacao.getDescricao(), MatchMode.START) );
		}		
		return select.list();
	}	
}
