package br.gov.pmdf.sicii.domain.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe DocumentoPesquisa 
 * OBJETIVO: Representa a associacao entre os Documentos e as Pesquisas
 * AUTORES: Rogerio & Vitor
 */

@Entity
public class DocumentoPesquisa extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	//atributos da classe
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
