/**
 * Classe Organizacao
 * OBJETIVO: Representa as Organizações que solicitam ou são responsáveis por pesquisas
 * AUTORES: Rogério & Vitor
 */

package br.gov.sicii.domain;

import java.util.Date;

public class Organizacao extends BaseEntity {
	
	private static final long serialversionUID = 1L;

	//atributos da classe
	private Integer orgCodigo;
	private Integer tipo;
	private String sigla;
	private String descricao;
	private Date cadastradoEm;
	private Date alteradoEm;
	private Integer cadastradoPor;
	private Integer alteradoPor;	
	
	public Organizacao() {
		
	}
	
	//get and set da classe
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

	public Integer getCadastradoPor() {
		return cadastradoPor;
	}

	public void setCadastradoPor(Integer cadastradoPor) {
		this.cadastradoPor = cadastradoPor;
	}

	public Integer getAlteradoPor() {
		return alteradoPor;
	}

	public void setAlteradoPor(Integer alteradoPor) {
		this.alteradoPor = alteradoPor;
	}
}
