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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.jboss.seam.annotations.Name;

/**
 * Classe Parecer
 * OBJETIVO: Representar os Pareceres das Pesquisas, Investigacoes e Eventos 
 * de Investigacao
 * AUTORES: Rogerio & Vitor
 */

@Entity
@SequenceGenerator(name="parecerSequence", sequenceName="parecerSequencePostgres")
@Name("parecer")
public class Parecer extends BaseEntity {
		
	private static final long serialVersionUID = 1L;
	
	//atributos da classe
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="parecerSequence")
	@Column(name="parCodigo")
	private Integer codigoParecer;
	
	@OneToOne
	private Situacao situacao;
	
	private String parecer;
	
	@Temporal(TemporalType.DATE)
	private Date cadastradoEm;
	@OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
	@JoinColumn(name="cadastradoPor")
	private Usuario cadastradoPor;
	
	@Temporal(TemporalType.DATE)
	private Date alteradoEm;	
	@OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
	@JoinColumn(name="alteradoPor")
	private Usuario alteradoPor;	
			
	public Parecer() {
		
	}

	//get and set	
	public Integer getCodigoParecer() {
		return codigoParecer;
	}	
	public Situacao getSituacao() {
		return situacao;
	}
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	public String getParecer() {
		return parecer;
	}
	public void setParecer(String parecer) {
		this.parecer = parecer;
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
	public Usuario getCadastradoPor() {
		return cadastradoPor;
	}
	public void setCadastradoPor(Usuario cadastradoPor) {
		this.cadastradoPor = cadastradoPor;
	}
	public Usuario getAlteradoPor() {
		return alteradoPor;
	}
	public void setAlteradoPor(Usuario alteradoPor) {
		this.alteradoPor = alteradoPor;
	}
}
