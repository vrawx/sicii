package br.gov.pmdf.sicii.domain.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
}
