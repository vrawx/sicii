/**
 * Classe Situacao
 * OBJETIVO: Representa a situação de Pesquisas, Evento de Investigacao e Investigações
 * AUTORES: Rogério & Vitor
 */

package br.gov.sicii.domain;

public class Situacao extends BaseEntity {
	//atributos da classe
	private Integer orgCodigo;
	private Integer tipo;
	private String sigla;
	private String descricao;

	public Situacao() {

	}
	
	//set and get da classe
	public Integer getOrgCodigo() {
		return orgCodigo;
	}

	public void setOrgCodigo(Integer orgCodigo) {
		this.orgCodigo = orgCodigo;
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
