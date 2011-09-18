package br.gov.pmdf.sicii.aplicacao;

import java.io.Serializable;
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

import br.gov.pmdf.sicii.domain.entidade.Agencia;
import br.gov.pmdf.sicii.domain.entidade.Auditoria;
import br.gov.pmdf.sicii.domain.entidade.Usuario;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioAgencia;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioAuditoria;
import br.gov.pmdf.sicii.domain.service.AgenciaService;

@Name("agenciaManaged")
@Scope(ScopeType.CONVERSATION)
public class AgenciaManaged implements Serializable {

	private static final long serialVersionUID = 1L;

	@In(scope=ScopeType.SESSION)
	private Usuario usuarioLogado;
	
	@In(scope=ScopeType.CONVERSATION) @Out(scope=ScopeType.CONVERSATION, required=false)	
	private Agencia agencia;	
	
	@DataModel
	private List<Agencia> agenciaConsultadas;	
			
	@In(create=true) 
	private AgenciaService agenciaService;
	
	@In
	private RepositorioAgencia repositorioAgencia;
	
	@In
	private RepositorioAuditoria repositorioAuditoria;
	
	@SuppressWarnings("unused")
	@Factory("agenciaConsultadas")
	private void factoryAgenciaConsultadas() {
		repositorioAuditoria.armazenar(new Auditoria(usuarioLogado, "Pesquisar Agencia", new Date(), agencia.getOrganizacao().getDescricao()));
		agenciaConsultadas = repositorioAgencia.recuperarTodos();
	}
	
	@Begin(flushMode=FlushModeType.AUTO, join=true)
	public void pesquisarAgencia() {			
		agenciaConsultadas = repositorioAgencia.recuperarTodos();
	}
	
	public String cadastrarAgencia(Agencia agencia){
		if(agenciaService.isAgenciaValid(agencia)) {
			agencia.setCadastradoPor(usuarioLogado);
			agencia.setCadastradoEm(new Date());
			agencia.setAlteradoPor(usuarioLogado);
			agencia.setAlteradoEm(new Date());

			repositorioAgencia.armazenar(agencia);
			repositorioAuditoria.armazenar(new Auditoria(usuarioLogado, "Cadastrar Agência", new Date(), agencia.getOrganizacao().getSigla()+"-"+agencia.getCodigoAgencia()));
			agencia = null;
			return "sucess";			
		}
		return "fail";
	}
	
	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}
	public void setUsuarioLogado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public List<Agencia> getAgenciaConsultadas() {
		return agenciaConsultadas;
	}
}
