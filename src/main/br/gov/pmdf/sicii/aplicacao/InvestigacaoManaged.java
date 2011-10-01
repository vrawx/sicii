package br.gov.pmdf.sicii.aplicacao;

import java.io.Serializable;
import java.util.List;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.annotations.datamodel.DataModel;

import br.gov.pmdf.sicii.domain.entidade.Investigacao;
import br.gov.pmdf.sicii.domain.entidade.Investigado;
import br.gov.pmdf.sicii.domain.entidade.Pesquisa;
import br.gov.pmdf.sicii.domain.entidade.Usuario;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioAuditoria;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioInvestigacao;

/*
 * 		Este caso de uso é iniciada a partir da execução do investigadoManaged, sendo esta classe resposável 
 * 	por iniciar a conversação de investigação e injetar o objeto investigado nesta conversation.
 * 
 */

@Name("investigacaoManaged")
@Scope(ScopeType.CONVERSATION)
public class InvestigacaoManaged  {
	
	@In(scope=ScopeType.SESSION) 
	private Usuario usuarioLogado;
	
	@In(required=false) @Out(required=false)
	private Investigacao investigacao;
	
	@DataModel
	private List<Investigacao> investigacoes;
	
	// investigadoManaged outjeta este objeto
	@In(required=true)  
	private Investigado investigado;
	
	@In
	private RepositorioInvestigacao repositorioInvestigacao;		
	
	@In
	private RepositorioAuditoria repositorioAuditoria;
	
	
	public InvestigacaoManaged() {
		System.out.println("funfa");
		// TODO Auto-generated constructor stub
	}
	/*
	 * 	Métodos de açoes do caso de uso Investigacao
	 */	
	public String selecionarInvestigacao(Investigacao investigacao) {
		this.investigacao = investigacao;
		return "select";
	}
	public String cadastrarInvestigacao() {		
		repositorioInvestigacao.armazenar(investigacao);
		return "sucess";
	}
	public String excluirInvestigacao(Investigacao investigacao) {
		repositorioInvestigacao.remover(investigacao);
		return "sucess";
	}
	public void gerarRis() {
		// TODO Auto-generated method stub
	}	
	public void cadastrarParecer() {
		// TODO Auto-generated method stub
	}	
	/*
	 * 	Métodos de açoes do caso de uso Pesquisa
	 */
	public void selecionarPesquisa(Pesquisa pesquisa) {		
		// TODO Auto-generated method stub
	}
	public void alterarPesquisa(Pesquisa pesquisa) {
		// TODO Auto-generated method stub
	}
	public void excluirPesquisa(Pesquisa pesquisa) {
		// TODO Auto-generated method stub
	}
	public void importarPesquisa() {
		// TODO Auto-generated method stub
	}
	public void desfazerVinculo(Pesquisa pesquisa) {		
		// TODO Auto-generated method stub
	}
	public void gerenciarEmbasamento() {
		
	}
	
	/*
	 *  Método Acessório 
	 */
	@Factory("investigacoes")
	public void factoryInvestigacoes() {
		//investigacoes = repositorioInvestigacao.recuperarInvestigacoesInvestigado(investigado);
		investigacoes = repositorioInvestigacao.recuperarTodos();
	}
	public List<Investigacao> getInvestigacoes() {
		return investigacoes;
	}
	public Investigado getInvestigado() {
		return investigado;
	}	
}
