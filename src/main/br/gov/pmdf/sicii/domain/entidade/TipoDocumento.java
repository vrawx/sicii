package br.gov.pmdf.sicii.domain.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe TipoDocumento
 * OBJETIVO: Representa os tipos de documentos existentes no Sistema
 * AUTORES: Rogerio & Vitor
 */

@Entity
public class TipoDocumento extends BaseEntity {
	
	
	private static final long serialVersionUID = 1L;
	
	//atributos do sistema
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer tipCodigo;
	
	private String sigla;
	private String descricao;	

	public TipoDocumento() {

	}

	//get and set
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
