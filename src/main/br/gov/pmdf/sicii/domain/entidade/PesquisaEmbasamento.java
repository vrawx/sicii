package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;

/**
 * Classe PesquisaEmbasamento
 * OBJETIVO: Representa a associacao entre as Pesquisas e os Embasamentos
 * AUTORES: Rogerio & Vitor
 */

public class PesquisaEmbasamento extends BaseEntity {
	//atributos da classe
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
