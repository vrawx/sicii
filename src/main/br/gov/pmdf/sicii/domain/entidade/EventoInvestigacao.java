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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

import org.jboss.seam.annotations.Name;

/**
 * Classe EventoInvestigacao
 * OBJETIVO: Representa os Eventos de Investigacao que contem as Investigacoes sobre o Investigado
 * AUTORES: Rogerio & Vitor
 */

@Entity
@SequenceGenerator(name="eventoSequence", sequenceName="eventoSequencePostgres")
@Name("eventoInvestigacao")
public class EventoInvestigacao extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//atributos da classe
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="eventoSequence")
	@Column(name="eveCodigo")
	private Long codigoEvento;	
	
	@OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
	@JoinColumn(name="parCodigo")	
	private Parecer parecer;
	
	@OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
	@JoinColumn(name="sitCodigo")	
	private Situacao situacao;
	
	@ManyToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
	@JoinColumn	
	private Organizacao organizacao;
	
	private Integer numeroEvento;	
	private Integer ano;	
	private String descricao;				
	
	@Transient
	private List<Investigado> investigados;
	
	private List<Investigacao> investigacoes;
	
	public EventoInvestigacao() {
	
	}
	
	//get and set da classe
	public Long getCodigoEvento() {
		return codigoEvento;
	}	
	public List<Investigacao> getInvestigacoes() {
		return investigacoes;
	}
	public void setInvestigacoes(List<Investigacao> investigacoes) {
		this.investigacoes = investigacoes;
	}		
	public Parecer getParecer() {
		if (parecer == null) 
			parecer = new Parecer();
		return parecer;
	}
	public void setParecer(Parecer parecer) {
		this.parecer = parecer;
	}
	public List<Investigado> getInvestigados() {		
		return investigados;
	}
	public void setInvestigados(List<Investigado> investigados) {
		this.investigados = investigados;
	}
	public Organizacao getOrganizacao() {
		if(organizacao == null)
			organizacao = new Organizacao();
		return organizacao;
	}
	public void setOrganizacao(Organizacao organizacao) {
		this.organizacao = organizacao;
	}
	public Situacao getSituacao() {	
		return situacao;
	}
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	public Integer getNumeroEvento() {
		return numeroEvento;
	}
	public void setNumeroEvento(Integer numeroEvento) {
		this.numeroEvento = numeroEvento;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setCodigoEvento(Long codigoEvento) {
		this.codigoEvento = codigoEvento;
	}	
}
