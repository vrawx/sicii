package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Classe Investigacao
 * OBJETIVO: Representa as Investigacoes do Investigado
 * AUTORES: Rogerio & Vitor
 */

@Entity
public class Investigacao extends BaseEntity {
		
	private static final long serialVersionUID = 1L;
	
	//atributos da classe
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer ivtCodigo;
	
	private Parecer parecer;
	private Situacao situacao;
	private EventoInvestigacao eventoInvestigacao;
	private Investigado investigado;
	private Date cadastradoEm;
	private Date alteradoEm;
	private Integer cadastradoPor;
	private Integer alteradoPor;
	
	@OneToMany
	private List<Investigado> investigados;
	
	@OneToMany
	private List<Pesquisa> pesquisas;
	
	//metodo Construtor
	public Investigacao() {
		
	}

	//get and set da classe
	public Integer getIvtCodigo() {
		return ivtCodigo;
	}

	public void setIvtCodigo(Integer ivtCodigo) {
		this.ivtCodigo = ivtCodigo;
	}

	public Parecer getParecer() {
		return parecer;
	}

	public void setParecer(Parecer parecer) {
		this.parecer = parecer;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public EventoInvestigacao getEventoInvestigacao() {
		return eventoInvestigacao;
	}

	public void setEventoInvestigacao(EventoInvestigacao eventoInvestigacao) {
		this.eventoInvestigacao = eventoInvestigacao;
	}

	public Investigado getInvestigado() {
		return investigado;
	}

	public void setInvestigado(Investigado investigado) {
		this.investigado = investigado;
	}

	public Date getCadastradoEm() {
		return cadastradoEm;
	}

	public void setCadastradoEm(Date cadastradoEm) {
		this.cadastradoEm = cadastradoEm;
	}

	public Date getAlteradoEm() {
		return alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	public Integer getCadastradoPor() {
		return cadastradoPor;
	}

	public void setCadastradoPor(Integer cadastradoPor) {
		this.cadastradoPor = cadastradoPor;
	}

	public Integer getAlteradoPor() {
		return alteradoPor;
	}

	public void setAlteradoPor(Integer alteradoPor) {
		this.alteradoPor = alteradoPor;
	}

	public List<Investigado> getInvestigados() {
		return investigados;
	}

	public void setInvestigados(List<Investigado> investigados) {
		this.investigados = investigados;
	}

	public List<Pesquisa> getPesquisas() {
		return pesquisas;
	}

	public void setPesquisas(List<Pesquisa> pesquisas) {
		this.pesquisas = pesquisas;
	}
}
