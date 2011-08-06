/**
 * Classe DocumentoPesquisa 
 * OBJETIVO: Representa a associaçao entre os Documentos e as Pesquisas
 * AUTORES: Rogério & Vitor
 */

package br.gov.sicii.domain;

public class DocumentoPesquisa extends BaseEntity{
	//atributos da classe
	private Integer dpeCodigo;
	private Pesquisa pesquisa;
	private Documento documento;
	
	public DocumentoPesquisa() {

	}
	
	//get and set da classe
	public Integer getDpeCodigo() {
		return dpeCodigo;
	}

	public void setDpeCodigo(Integer dpeCodigo) {
		this.dpeCodigo = dpeCodigo;
	}

	public Pesquisa getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(Pesquisa pesquisa) {
		this.pesquisa = pesquisa;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
}
