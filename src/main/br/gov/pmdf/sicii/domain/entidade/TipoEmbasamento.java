package br.gov.pmdf.sicii.domain.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe TipoEmbasamento
 * OBJETIVO: Representar os Tipos de Embasamento das Pesquisas realizadas pelos Agentes
 * AUTORES: Rogerio & Vitor
 */

@Entity
public class TipoEmbasamento extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private Integer tipEmbasamento;
	private String sigla;
	private String descricao;
		

	//get and set
	public Long getId() {
		return id;
	}
	public Integer getTipEmbasamento() {
		return tipEmbasamento;
	}
	public void setTipEmbasamento(Integer tipEmbasamento) {
		this.tipEmbasamento = tipEmbasamento;
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
