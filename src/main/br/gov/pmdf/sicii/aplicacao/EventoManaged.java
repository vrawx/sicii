package br.gov.pmdf.sicii.aplicacao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.End;
import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.datamodel.DataModel;

import br.gov.pmdf.sicii.aplicacao.facade.EventoFacade;
import br.gov.pmdf.sicii.domain.entidade.Auditoria;
import br.gov.pmdf.sicii.domain.entidade.EventoInvestigacao;
import br.gov.pmdf.sicii.domain.entidade.Organizacao;
import br.gov.pmdf.sicii.domain.entidade.Parecer;
import br.gov.pmdf.sicii.domain.entidade.Usuario;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioAuditoria;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioEventoInvestigacao;
import br.gov.pmdf.sicii.domain.service.EventoInvestigacaoService;

@Name("eventoManaged")
public class EventoManaged implements Serializable {

	private static final long serialVersionUID = 1L;

	@In(scope=ScopeType.SESSION)
	private Usuario usuarioLogado;
	
	@In(required=false)	@Out(required=false)
	private EventoInvestigacao eventoInvestigacao;
	
	@DataModel
	private List<EventoInvestigacao> eventosConsultados;	
		
	@In(create=true)
	private EventoFacade eventoFacade;
	
	@In(create=true) 
	private EventoInvestigacaoService eventoInvestigacaoService;
	
	@In
	private RepositorioEventoInvestigacao repositorioEventoInvestigacao;
	
	@In
	private RepositorioAuditoria repositorioAuditoria;
	
	@SuppressWarnings("unused")
	@Factory("eventosConsultados")
	private void factoryEventosConsultados() {
		eventosConsultados = repositorioEventoInvestigacao.recuperarTodos();
	}
	@End
	public void pesquisarEvento() {	
		//repositorioAuditoria.armazenar(new Auditoria(usuarioLogado, "Pesquisar Evento", new Date(), eventoInvestigacao.getDescricao()));
		eventosConsultados = repositorioEventoInvestigacao.recuperarPorFragmento(eventoInvestigacao);
	}
	//@End
	public String editarEvento(EventoInvestigacao eventoInvestigacao) {		
		this.eventoInvestigacao = eventoInvestigacao;
		return "foward";
	}
	//@End
	public String excluirEvento(EventoInvestigacao eventoInvestigacao) throws Exception{
		repositorioEventoInvestigacao.remover(eventoInvestigacao);
		repositorioAuditoria.armazenar(new Auditoria(usuarioLogado, "Evento Managed - Excluir Evento", new Date(), eventoInvestigacao.getDescricao()+"-"+eventoInvestigacao.getCodigoEvento()));
		this.eventoInvestigacao = eventoInvestigacao;
		return "sucess";
	}
	//@End
	public String alterarEvento(EventoInvestigacao eventoInvestigacao) {
		this.eventoInvestigacao = eventoInvestigacao;
		repositorioAuditoria.armazenar(new Auditoria(usuarioLogado, "Evento Managed - Alterar Evento", new Date(), eventoInvestigacao.getDescricao()+"-"+eventoInvestigacao.getCodigoEvento()));
		return "sucess";
	}
	//@End
	public String cadastrarEvento() throws Exception {		
		System.out.println(eventoInvestigacao);
		if(eventoInvestigacaoService.isEventoInvestigacaoValid(eventoInvestigacao)) {			
			eventoInvestigacao.setCadastradoPor(usuarioLogado);
			eventoInvestigacao.setCadastradoEm(new Date());
			eventoInvestigacao.setAlteradoPor(usuarioLogado);
			eventoInvestigacao.setAlteradoEm(new Date());
			//Assesssoria Ativa do usuario logado			
			eventoInvestigacao.setAssessoria(eventoFacade.getAssessoriaAtivaUsuario(usuarioLogado));
			eventoInvestigacao.setParecer(new Parecer());			
			eventoInvestigacao.setOrganizacao(new Organizacao());			
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
