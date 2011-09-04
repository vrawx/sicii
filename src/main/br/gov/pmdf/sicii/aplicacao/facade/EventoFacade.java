package br.gov.pmdf.sicii.aplicacao.facade;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.datamodel.DataModel;

import br.gov.pmdf.sicii.domain.entidade.Organizacao;
import br.gov.pmdf.sicii.domain.entidade.Situacao;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioAssessoria;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioOrganizacao;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioSituacao;

@Name("eventoFacade")
public class EventoFacade {

	@In
	private RepositorioAssessoria repositorioAssessoria;	
	@In
	private RepositorioSituacao repositorioSituacao;	
	@In
	private RepositorioOrganizacao repositorioOrganizacao;
	
	@DataModel @Out(required=false)	
	private List<SelectItem> situacoesCombo;
	
	@DataModel @Out(required=false)
	private List<Organizacao> organizacoesConsultadas;
	
	@Factory("situacoesCombo")
	public void factorySituacoesCombo() {
		List<Situacao> situacoesValidas = repositorioSituacao.pesquisarGrupoSituacao("EVENTO");
		situacoesCombo = new ArrayList<SelectItem>();
		for (Situacao situacao : situacoesValidas) 
			situacoesCombo.add(new SelectItem(situacao.getSigla()));		
	}	
	@Factory(value="organizacoesConsultadas")
	public void factoryOrganizacoesConsultadas() {
		organizacoesConsultadas = repositorioOrganizacao.recuperarTodos();
	}
	public List<Organizacao> getOrganizacoesConsultadas() {
		return organizacoesConsultadas;
	}	
	public List<SelectItem> getSituacoesCombo() {
		return situacoesCombo;
	}	
}
