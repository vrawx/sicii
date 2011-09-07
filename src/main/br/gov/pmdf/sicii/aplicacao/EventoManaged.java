package br.gov.pmdf.sicii.aplicacao;

import java.util.Date;
import java.util.List;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.datamodel.DataModel;
import org.jboss.seam.annotations.datamodel.DataModelSelection;

import br.gov.pmdf.sicii.aplicacao.facade.EventoFacade;
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
	private RepositorioEventoInvestigacao repositorioEventoInvestigacao;
	@In
	private RepositorioAuditoria repositorioAuditoria;
	@In(create=true) 
	private EventoInvestigacaoService eventoInvestigacaoService;		
	@In(create=true) @Out(required=false)	
	private EventoInvestigacao eventoInvestigacao;	
	
	@DataModel
	private List<EventoInvestigacao> eventosConsultados;	
	@Out(required=false) @DataModelSelection
	private EventoInvestigacao eventoSelecionado;
	
	@In(create=true)
	private EventoFacade eventoFacade;
	
	@Factory("eventosConsultados")
	private void factoryEventosConsultados() {
		eventosConsultados = repositorioEventoInvestigacao.recuperarTodos();
	}
	
	public void pesquisarEvento() {	
		repositorioAuditoria.armazenar(new Auditoria(usuarioLogado, "Pesquisar Evento", new Date(), eventoInvestigacao.getDescricao()));
		eventosConsultados = repositorioEventoInvestigacao.recuperarPorFragmento(eventoInvestigacao);
	}
	public String editarEvento(EventoInvestigacao eventoInvestigacao) {
		eventoSelecionado = eventoInvestigacao;
		return "foward";
	}
	public String excluirEvento(EventoInvestigacao eventoInvestigacao) {
		repositorioEventoInvestigacao.remover(eventoInvestigacao);
		//eventoSelecionado = eventoInvestigacao;
		return "sucess";
	}
	public String alterarEvento(EventoInvestigacao eventoInvestigacao) {
		eventoSelecionado = eventoInvestigacao;
		return "sucess";
	}
	public String cadastrarEvento() {
		if(eventoInvestigacaoService.isEventoInvestigacaoValid(eventoInvestigacao)) {
			eventoInvestigacao.setCadastradoPor(usuarioLogado);
			eventoInvestigacao.setCadastradoEm(new Date());
			eventoInvestigacao.setAlteradoPor(usuarioLogado);
			eventoInvestigacao.setAlteradoEm(new Date());
			eventoInvestigacao.setParecer(null);			
			//Assesssoria Ativa do usuario logado
			eventoInvestigacao.setAssessoria(eventoFacade.getAssessoriaAtivaUsuario(usuarioLogado));			
			eventoInvestigacao.setOrganizacao(null);			
			repositorioEventoInvestigacao.armazenar(eventoInvestigacao);
			repositorioAuditoria.armazenar(new Auditoria(usuarioLogado, "Evento Managed - Cadastrar Evento", new Date(), eventoInvestigacao.getDescricao()+"-"+eventoInvestigacao.getCodigoEvento()));
			return "sucess";
		}
		return "fail";
	}
	public List<EventoInvestigacao> getEventosConsultados() {
		return eventosConsultados;
	}	
	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}
	public EventoInvestigacao getEventoInvestigacao() {
		return eventoInvestigacao;
	}
	public void setEventoInvestigacao(EventoInvestigacao eventoInvestigacao) {
		this.eventoInvestigacao = eventoInvestigacao;
	}	
}
