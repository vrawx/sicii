package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

import org.jboss.seam.annotations.Name;

/**
 * Classe Agencia
 * OBJETIVO: Representa as Agência do Sistema
 * AUTORES: Rogério & Vitor
 */

@Entity
@SequenceGenerator(name="agenciaSequence", sequenceName="agenciaSequencePostgres")
@Name("agencia")
public class Agencia extends BaseEntity {
		
	private static final long serialVersionUID = 1L;
	
	//atributos da classe
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="agenciaSequence")
	@Column(name="ageCodigo")
	private Long codigoAgencia;
	
	@OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
	private Organizacao organizacao;
	
	// Deve ser 0 - CENTRAL, 1 - LOCAL
	private Integer tipo;
	private Boolean status;
	
	@OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
	@JoinColumn
	private Usuario cadastradoPor;
	private Date cadastradoEm;
	
	@OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
	@JoinColumn
	private Usuario alteradoPor;
	private Date alteradoEm;
			
	@Transient
	private List<Assessoria> assessorias;
	
	public Agencia() {}

	//get and set da classe	
	public Usuario getAlteradoPor() {
		return alteradoPor;
	}
	public void setAlteradoPor(Usuario alteradoPor) {
		this.alteradoPor = alteradoPor;
	}
	public Usuario getCadastradoPor() {
		return cadastradoPor;
	}
	public void setCadastradoPor(Usuario cadastradoPor) {
		this.cadastradoPor = cadastradoPor;
	}
	public Long getCodigoAgencia() {
		return codigoAgencia;
	}
	public Organizacao getOrganizacao() {
		return organizacao;
	}
	public void setOrganizacao(Organizacao organizacao) {
		this.organizacao = organizacao;
	}
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
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
	public List<Assessoria> getAssessorias() {
		return assessorias;
	}
	public void setAssessorias(List<Assessoria> assessorias) {
		this.assessorias = assessorias;
	}
}
