package br.gov.pmdf.sicii.aplicacao;

import java.util.List;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.annotations.datamodel.DataModel;
import br.gov.pmdf.sicii.domain.entidade.Investigado;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioInvestigado;
import br.gov.pmdf.sicii.domain.service.impl.InvestigadoServiceImpl;


@Name("investigadoManaged")
@Scope(ScopeType.CONVERSATION)
public class InvestigadoManaged  {
	
//	@In
//	private Usuario usuarioLogado;
	
	@In(create=true)
	private Investigado investigado;	
	
	@DataModel("investigadosConsultados")
	private List<Investigado> investigadosConsultados;	
	
	@In
	private RepositorioInvestigado repositorioInvestigado;	
	
	private InvestigadoServiceImpl investigadoService;
	
	//@Restrict("#{s:hasRole('ADMINISTRADOR')}")
	public void pesquisarInvestigado() {		
		investigadosConsultados = repositorioInvestigado.recuperarTodos();
		System.out.println(investigado.getNome());		
		//investigadosConsultados = repositorioInvestigado.recuperarPorFragmento(investigado);				
	}
	
	public void selecionarInvestigado(Investigado investigado) {
		
	}	
	public void cadastrarInvestigado() {		
		investigadoService.aplicarRegradeNegocio(investigado);
		repositorioInvestigado.armazenar(investigado);
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
