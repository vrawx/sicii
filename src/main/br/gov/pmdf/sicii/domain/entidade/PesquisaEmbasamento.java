package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe PesquisaEmbasamento
 * OBJETIVO: Representa a associacao entre as Pesquisas e os Embasamentos
 * AUTORES: Rogerio & Vitor
 */

@Entity 
public class PesquisaEmbasamento extends BaseEntity {

	private static final long serialVersionUID = 1L;

	//atributos da classe
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private Integer pemCodigo;
	
	private Pesquisa pesquisa;
	private Embasamento embasamento;
	private Date vinculado;
	
	public PesquisaEmbasamento() {

	}

	//get and set
	public Integer getPemCodigo() {
		return pemCodigo;
	}

	public void setPemCodigo(Integer pemCodigo) {
		this.pemCodigo = pemCodigo;
	}

	public Pesquisa getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(Pesquisa pesquisa) {
		this.pesquisa = pesquisa;
	}

	public Embasamento getEmbasamento() {
		return embasamento;
	}

	public void setEmbasamento(Embasamento embasamento) {
		this.embasamento = embasamento;
	}

	public Date getVinculado() {
		return vinculado;
	}

	public void setVinculado(Date vinculado) {
		this.vinculado = vinculado;
	}
}
