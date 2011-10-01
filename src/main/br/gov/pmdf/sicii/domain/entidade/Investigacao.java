package br.gov.pmdf.sicii.domain.entidade;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import org.jboss.seam.annotations.Name;

/**
 * Classe Investigacao
 * OBJETIVO: Representa as Investigacoes do Investigado
 * AUTORES: Rogerio & Vitor
 */
@Entity
@SequenceGenerator(name="investigacaoSequence", sequenceName="investigacaoSequencePostgres")
@Name("investigacao")
public class Investigacao extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	//atributos da classe	
																 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="investigacaoSequence")
	@Column(name="ivtCodigo")
	private Long codigoInvestigacao;
	
	@OneToOne
	private Parecer parecer;	
	
	@OneToOne
	@JoinColumn
	private Situacao situacao;
	
	@ManyToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
	@JoinColumn
	private EventoInvestigacao eventoInvestigacao;
	
	@OneToMany
	private List<Investigado> investigados;
	
	@OneToMany
	private List<Pesquisa> pesquisas;
	

	//get and set da classe
	public Long getCodigoInvestigacao() {
		return codigoInvestigacao;
	}
	public void setCodigoInvestigacao(Long codigoInvestigacao) {
		this.codigoInvestigacao = codigoInvestigacao;
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
