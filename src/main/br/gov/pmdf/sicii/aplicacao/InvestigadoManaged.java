package br.gov.pmdf.sicii.aplicacao;

import java.util.List;

import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.datamodel.DataModel;

import br.gov.pmdf.sicii.domain.entidade.Investigado;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioInvestigado;

@Name("investigadoManaged")
public class InvestigadoManaged  {
	
	//@In(scope=ScopeType.SESSION)
	//private Usuario usuarioLogado;
	
	@In(create=true)
	private Investigado investigado;	
	
	@DataModel
	private List<Investigado> investigadosConsultados;
	
	@In
	private RepositorioInvestigado repositorioInvestigado;	
	
	//private InvestigadoServiceImpl investigadoService;
	
	//@Restrict("#{s:hasRole('ADMINISTRADOR')}")	
	public void pesquisarInvestigado() {
		//investigadosConsultados = repositorioInvestigado.recuperarTodos();		
		investigadosConsultados = repositorioInvestigado.recuperarPorFragmento(investigado);				
	}
	@Factory("investigadosConsultados")
	public void factoryInvestigadosConsultados() {
		investigadosConsultados = repositorioInvestigado.recuperarTodos();
	}
		
	public String cadastrarInvestigado() {		
		//System.out.println(usuarioLogado.getLogin());
		//investigadoService.aplicarRegradeNegocio(investigado);
		repositorioInvestigado.armazenar(investigado);
		investigado = null;
		return "sucess";
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
