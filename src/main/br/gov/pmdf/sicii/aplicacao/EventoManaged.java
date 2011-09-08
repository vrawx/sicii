package br.gov.pmdf.sicii.aplicacao;

import java.util.Date;
import java.util.List;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Begin;
import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.FlushModeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;
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
@Scope(ScopeType.CONVERSATION)
public class EventoManaged {

	@In(scope=ScopeType.SESSION)
	private Usuario usuarioLogado;
	
	@In
	private RepositorioEventoInvestigacao repositorioEventoInvestigacao;
	
	@In
	private RepositorioAuditoria repositorioAuditoria;
	
	@In(create=true) 
	private EventoInvestigacaoService eventoInvestigacaoService;		
	
	@In(scope=ScopeType.CONVERSATION, required=false) @Out(required=false)	
	private EventoInvestigacao eventoInvestigacao;	
	
	@DataModel @Out(scope=ScopeType.CONVERSATION, required=false)
	private List<EventoInvestigacao> eventosConsultados;	
	
	@DataModelSelection @Out(required=false) 
	private EventoInvestigacao eventoSelecionado;
	
	@In(create=true)
	private EventoFacade eventoFacade;
	
	@SuppressWarnings("unused")
	@Factory("eventosConsultados")
	private void factoryEventosConsultados() {
		eventosConsultados = repositorioEventoInvestigacao.recuperarTodos();
	}
	@Begin(flushMode=FlushModeType.AUTO, join=true)
	public void pesquisarEvento() {	
		repositorioAuditoria.armazenar(new Auditoria(usuarioLogado, "Pesquisar Evento", new Date(), eventoInvestigacao.getDescricao()));
		eventosConsultados = repositorioEventoInvestigacao.recuperarPorFragmento(eventoInvestigacao);
	}
	@Begin(flushMode=FlushModeType.AUTO, join=true)
	public String editarEvento(EventoInvestigacao eventoInvestigacao) {
		System.out.println(eventoInvestigacao);
		eventoSelecionado = eventoInvestigacao;
		return "foward";
	}
	@Begin(flushMode=FlushModeType.AUTO, join=true)
	public String excluirEvento(EventoInvestigacao eventoInvestigacaoSelecionado) throws Exception{
		repositorioEventoInvestigacao.remover(eventoInvestigacaoSelecionado);
		//eventoSelecionado = eventoInvestigacao;
		return "sucess";
	}
	@Begin(flushMode=FlushModeType.AUTO, join=true)
	public String alterarEvento(EventoInvestigacao eventoInvestigacao) {
		eventoSelecionado = eventoInvestigacao;
		return "sucess";
	}
	@Begin(flushMode=FlushModeType.AUTO, join=true)
	public String cadastrarEvento() throws Exception {
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
			eventoInvestigacao = null;
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
	public EventoInvestigacao getEventoSelecionado() {
		return eventoSelecionado;
	}
	public void setEventoSelecionado(EventoInvestigacao eventoSelecionado) {
		this.eventoSelecionado = eventoSelecionado;
	}
}
