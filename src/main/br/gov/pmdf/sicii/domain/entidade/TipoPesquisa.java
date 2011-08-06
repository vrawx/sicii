package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;

/**
 * Classe TipoPesquisa
 * OBJETIVO: Representar os Tipos de Pesquisas que compoem as Investigacoes dos Eventos 
 * de Investigacao
 * AUTORES: Rogerio & Vitor
 */

public class TipoPesquisa extends BaseEntity {
	
	private static final long serialversionUID = 1L;
	
	//atributos da classe
	private Integer tipCodigo;
	private String sigla;
	private String descricao;
	private Date cadastradoEm;
	private Date alteradoEm;
	private Integer cadastradoPor;
	private Integer alteradoPor;	
	
	public TipoPesquisa() {

	}

	//get and set da classe
	public Integer getTipCodigo() {
		return tipCodigo;
	}

	public void setTipCodigo(Integer tipCodigo) {
		this.tipCodigo = tipCodigo;
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
