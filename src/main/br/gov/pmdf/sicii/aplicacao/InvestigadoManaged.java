package br.gov.pmdf.sicii.aplicacao;

import java.util.Date;
import java.util.List;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.datamodel.DataModel;
import br.gov.pmdf.sicii.domain.entidade.Investigado;
import br.gov.pmdf.sicii.domain.entidade.Usuario;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioInvestigado;
import br.gov.pmdf.sicii.domain.service.impl.InvestigadoServiceImpl;

@Name("investigadoManaged")
public class InvestigadoManaged {	

	private static final long serialVersionUID = 1L;

	@In(scope=ScopeType.SESSION)
	private Usuario usuarioLogado;	
		
	@In(required=false) @Out(required=false)
	private Investigado investigado;	
		
	@DataModel
	private List<Investigado> investigadosConsultados;
		
	@In
	private RepositorioInvestigado repositorioInvestigado;
			
	@In
	private InvestigadoServiceImpl investigadoService;	
	
	
	//@Restrict("#{s:hasRole('ADMINISTRADOR')}")	
	public void pesquisarInvestigado() {
		investigadoService.cadastrarAuditoria(investigado, "Pesquisar Investigado");
		investigadosConsultados = repositorioInvestigado.recuperarPorFragmento(investigado);		
	}
	@Factory("investigadosConsultados")
	public void factoryInvestigadosConsultados() {
		investigadosConsultados = repositorioInvestigado.recuperarTodos();
	}
	public String alterarInvestigado(Investigado investigado) {		
		if( investigadoService.isCandidatoValido(investigado) ) {			
			investigado.setAlteradoPor(usuarioLogado);
			investigado.setAlteradoEm(new Date());			
			repositorioInvestigado.armazenar(investigado);
			// Registro de Auditoria
			investigadoService.cadastrarAuditoria(investigado, "alterarInvestigado");			
			return "sucess";
		}
		return "fail";		
	}
	public void excluirInvestigado(Investigado investigado) {
		repositorioInvestigado.remover(investigado);
		investigadoService.cadastrarAuditoria(investigado, "Excluindo Investigado");
		System.out.println("passou aqui");				
	}
	//@End
	public String cadastrarInvestigado() {		
		System.out.println(investigado);
		if( investigadoService.isCandidatoValido(investigado) ) {
			investigado.setCadastradoPor(usuarioLogado);
			investigado.setCadastradoEm(new Date());
			investigado.setAlteradoPor(usuarioLogado);
			investigado.setAlteradoEm(new Date());
			investigado.setExcluido(false);			
			repositorioInvestigado.armazenar(investigado);
			// Registro de auditoria
			investigadoService.cadastrarAuditoria(investigado, "Cadastrando Investigado");
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
	public List<Investigado> getInvestigadosConsultados() {
		return investigadosConsultados;
	}
	public Investigado getInvestigado() {
		return investigado;
	}
	public void setInvestigado(Investigado investigado) {
		this.investigado = investigado;
	}
}
