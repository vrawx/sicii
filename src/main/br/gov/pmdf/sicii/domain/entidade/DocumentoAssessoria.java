package br.gov.pmdf.sicii.domain.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe DocumentoAssessoria
 * OBJETIVO: Representa os registros do tramite dos documentos entre as Assessorias
 * AUTORES: Rogerio & Vitor
 */

@Entity
public class DocumentoAssessoria extends BaseEntity implements Serializable {

	//atributos da classe
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private Long dasCodigo;
	private Documento documento;
	private Assessoria assessoria;
	private Boolean status;
	
	public DocumentoAssessoria() {

	}

	//get and set
	public Long getDasCodigo() {
		return dasCodigo;
	}
	public void setDasCodigo(Long dasCodigo) {
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
