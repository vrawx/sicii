package br.gov.pmdf.sicii.aplicacao;

import java.util.Date;
import java.util.List;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.datamodel.DataModel;

import br.gov.pmdf.sicii.domain.entidade.Auditoria;
import br.gov.pmdf.sicii.domain.entidade.EventoInvestigacao;
import br.gov.pmdf.sicii.domain.entidade.Usuario;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioAuditoria;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioEventoInvestigacao;
import br.gov.pmdf.sicii.domain.service.EventoInvestigacaoService;

@Name("eventoManaged")
public class EventoManaged {

	@In(scope=ScopeType.SESSION)
	private Usuario usuarioLogado;
	@In
	private EventoInvestigacaoService eventoInvestigacaoService;
	@In
	private RepositorioEventoInvestigacao repositorioEventoInvestigacao;
	@In
	private RepositorioAuditoria repositorioAuditoria;
	
	@In @Out(required=false)
	private EventoInvestigacao eventoInvestigacao;
		
	@DataModel
	private List<EventoInvestigacao> eventosConsultados;	
	
	
	public void pesquisarEvento() {	
		repositorioAuditoria.armazenar(new Auditoria(usuarioLogado, "Pesquisar Evento", new Date(), ""));
		eventosConsultados = repositorioEventoInvestigacao.recuperarPorFragmento(eventoInvestigacao);
	}
	
	public List<EventoInvestigacao> getEventosConsultados() {
		return eventosConsultados;
	}	
	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}
}
