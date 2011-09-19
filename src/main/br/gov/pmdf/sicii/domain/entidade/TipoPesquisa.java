package br.gov.pmdf.sicii.domain.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe TipoPesquisa
 * OBJETIVO: Representar os Tipos de Pesquisas que compoem as Investigacoes dos Eventos 
 * de Investigacao
 * AUTORES: Rogerio & Vitor
 */

@Entity
public class TipoPesquisa extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//atributos da classe
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer tipCodigo;
	private String sigla;
	private String descricao;		
	
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
}
