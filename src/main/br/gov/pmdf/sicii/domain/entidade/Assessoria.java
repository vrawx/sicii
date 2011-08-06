/**
 * Classe Assessoria
 * OBJETIVO: Representa as Assessorias que compoem as Agências do Sistema
 * AUTORES: Rogério & Vitor
 */

package br.gov.sicii.domain;

import java.util.Date;
import java.util.List;

public class Assessoria extends BaseEntity{
	
	private static final long serialversionUID = 1L;
	
	private Integer assCodigo;
	private Agencia agencia;
	private String sigla;
	private String descricao;
	private Boolean status;
	private Date cadastradoEm;
	private Date alteradoEm;
	private Integer cadastradoPor;
	private Integer alteradoPor;
	
	private List<UsuarioAssessoria> usuarios;
	private List<Documento> documentos;
	
	public Assessoria() {
		
	}

	//get and set
	public Integer getAssCodigo() {
		return assCodigo;
	}

	public void setAssCodigo(Integer assCodigo) {
		this.assCodigo = assCodigo;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
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

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
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

	public List<UsuarioAssessoria> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<UsuarioAssessoria> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Documento> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}
}
