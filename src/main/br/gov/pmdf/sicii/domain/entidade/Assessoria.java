package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

import org.hibernate.annotations.Cascade;
import org.jboss.seam.annotations.Name;

/**
 * Classe Assessoria
 * OBJETIVO: Representa as Assessorias que compoem as Agências do Sistema
 * AUTORES: Rogério & Vitor
 */

@Entity
@SequenceGenerator(name="assessoriaSequence", initialValue=0, sequenceName="assessoriaSequencePostgres" )
@Name("assessoria")
public class Assessoria extends BaseEntity {
	
	private static final long serialVersionUID = 1L;	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="assessoriaSequence")
	@Column(name="assCodigo")
	private Long codigoAssessoria;
	
	@ManyToOne
	@JoinColumn(name="agencia")
	private Agencia agencia;
	
	private String sigla;
	private String descricao;
	private Boolean status;
		
	@OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE} )
	@JoinColumn(name="cadastradoPor")
	private Usuario cadastradoPor;
	private Date cadastradoEm;
	
	@OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE} )
	@JoinColumn(name="alteradoPor")
	private Usuario alteradoPor;
	private Date alteradoEm;
	
	@OneToMany(fetch=FetchType.LAZY,  mappedBy="assessoria", cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.DELETE_ORPHAN})
	private List<UsuarioAssessoria> usuarioAssessorias;
	
	// Uso de referencia para Listas
	@Transient
	private List<Documento> documentos;
	
	public Assessoria() {
		
	}	
	
	//get and set
	public Long getCodigoAssessoria() {
		return codigoAssessoria;
	}
	public void setCodigoAssessoria(Long codigoAssessoria) {
		this.codigoAssessoria = codigoAssessoria;
	}	
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
	public void setCadastradoPor(Usuario cadastradoPor) {
		this.cadastradoPor = cadastradoPor;
	}
	public Usuario getCadastradoPor() {
		return cadastradoPor;
	}
	public void setAlteradoPor(Usuario alteradoPor) {
		this.alteradoPor = alteradoPor;
	}
	public Usuario getAlteradoPor() {
		return alteradoPor;
	}
	public List<UsuarioAssessoria> getUsuarioAssessorias() {
		return usuarioAssessorias;
	}
	public List<Documento> getDocumentos() {
		return documentos;
	}	
}
