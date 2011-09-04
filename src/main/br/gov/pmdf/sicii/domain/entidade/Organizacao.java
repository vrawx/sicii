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
 * Classe Organizacao
 * OBJETIVO: Representa as Organizacoes que solicitam ou sao responsaveis por pesquisas
 * AUTORES: Rogerio & Vitor
 */

@Entity
@SequenceGenerator(name="organizacaoSequence", sequenceName="organizacaoSequencePostgres")
@Name("organizacao")
public class Organizacao extends BaseEntity {

	private static final long serialVersionUID = 1L;

	//atributos da classe
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="organizacaoSequence")
	@Column(name="orgCodigo")
	private Integer codigoOrganizacao;
	
	// Deve ser 0 - EXTERNO, 1 - INTERNO
	private Integer tipo;
	private String sigla;
	private String descricao;	
	
	private Date cadastradoEm;
	@OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
	@JoinColumn
	private Usuario cadastradoPor;
	
	private Date alteradoEm;
	@OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
	@JoinColumn
	private Usuario alteradoPor;	
	
	public Organizacao() {
		
	}
	
	//get and set da classe
	public Integer getCodigoOrganizacao() {
		return codigoOrganizacao;
	}
	public void setCodigoOrganizacao(Integer codigoOrganizacao) {
		this.codigoOrganizacao = codigoOrganizacao;
	}
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
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
}
