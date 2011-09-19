package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

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
	
//	@ManyToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
//	@JoinColumn
//	private Assessoria assessoria;
	
//	@OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
//	@JoinColumn(name="parCodigo")	
//	private Parecer parecer;
	
//	@OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
//	@JoinColumn(name="sitCodigo")	
//	private Situacao situacao;
	
//	@ManyToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
//	@JoinColumn	
//	private Organizacao organizacao;
	
	private Integer numeroEvento;	
	private Integer ano;	
	private String descricao;	
	
	
	@OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
	@JoinColumn(name="cadastradoPor")
	private Usuario cadastradoPor;
	private Date cadastradoEm;
			
	@OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
	@JoinColumn(name="alteradoPor")
	private Usuario alteradoPor;
	private Date alteradoEm;
		
	
//	@Transient
//	private List<Investigado> investigados;
	

	public EventoInvestigacao() {
	
	}
	
	//get and set da classe
	public Long getCodigoEvento() {
		return codigoEvento;
	}
//	public Assessoria getAssessoria() {
//		if (assessoria == null) 
//			assessoria = new Assessoria();
//		return assessoria;
//	}
//	public void setAssessoria(Assessoria assessoria) {
//		this.assessoria = assessoria;
//	}	
//	public Parecer getParecer() {
//		if (parecer == null) 
//			parecer = new Parecer();
//		return parecer;
//	}
//	public void setParecer(Parecer parecer) {
//		this.parecer = parecer;
//	}
//	public List<Investigado> getInvestigados() {
//		if(investigados == null)
//			investigados = new ArrayList<Investigado>();
//		return investigados;
//	}
//	public void setInvestigados(List<Investigado> investigados) {
//		this.investigados = investigados;
//	}
//	public Organizacao getOrganizacao() {
//		if(organizacao == null)
//			organizacao = new Organizacao();
//		return organizacao;
//	}
//	public void setOrganizacao(Organizacao organizacao) {
//		this.organizacao = organizacao;
//	}
//	public Situacao getSituacao() {
//		if(situacao == null)
//			situacao = new Situacao();
//		return situacao;
//	}
//	public void setSituacao(Situacao situacao) {
//		this.situacao = situacao;
//	}
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
	public Usuario getCadastradoPor() {
		return cadastradoPor;
	}
	public void setCadastradoPor(Usuario cadastradoPor) {
		this.cadastradoPor = cadastradoPor;
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
	public void setAlteradoPor(Usuario alteradoPor) {
		this.alteradoPor = alteradoPor;
	}
	public Usuario getAlteradoPor() {
		return alteradoPor;
	}
}
