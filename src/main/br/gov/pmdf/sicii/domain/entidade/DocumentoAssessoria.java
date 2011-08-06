/**
 * Classe DocumentoAssessoria
 * OBJETIVO: Representa os registros do trâmite dos documentos entre as Assessorias
 * AUTORES: Rogério & Vitor
 */

package br.gov.sicii.domain;

public class DocumentoAssessoria extends BaseEntity {
	//atributos da classe
	private Integer dasCodigo;
	private Documento documento;
	private Assessoria assessoria;
	private Boolean status;
	
	public DocumentoAssessoria() {

	}

	//get and set
	public Integer getDasCodigo() {
		return dasCodigo;
	}

	public void setDasCodigo(Integer dasCodigo) {
		this.dasCodigo = dasCodigo;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public Assessoria getAssessoria() {
		return assessoria;
	}

	public void setAssessoria(Assessoria assessoria) {
		this.assessoria = assessoria;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
}
