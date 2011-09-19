package br.gov.pmdf.sicii.domain.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.jboss.seam.annotations.Name;

/**
 * Classe Situacao
 * OBJETIVO: Representa a situacao de Pesquisas, Evento de Investigacao e Investigacoes
 * AUTORES: Rogerio & Vitor
 */

@Entity
@SequenceGenerator(name="situacaoSequence", sequenceName="situacaoSequencePostgres")
@Name("situacao")
public class Situacao extends BaseEntity {

	private static final long serialVersionUID = 1L;

	//atributos da classe
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="situacaoSequence")
	@Column(name="sitCodigo")
	private Long codigoSituacao;
	
	// 0 - VALIDA . 1 - INVALIDA
	private Integer grupo;
	private String sigla;
	private String descricao;

	public Situacao() {

	}
	
	//set and get da classe
	public Long getCodigoSituacao() {
		return codigoSituacao;
	}
	public void setCodigoSituacao(Long codigoSituacao) {
		this.codigoSituacao = codigoSituacao;
	}
	public Integer getGrupo() {
		return grupo;
	}
	public void setGrupo(Integer grupo) {
		this.grupo = grupo;
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
