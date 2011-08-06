package br.gov.pmdf.sicii.domain.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

/**
 * Classe Parecer
 * OBJETIVO: Representar os Pareceres das Pesquisas, Investigacoes e Eventos 
 * de Investigacao
 * AUTORES: Rogerio & Vitor
 */

@Entity
public class Parecer extends BaseEntity implements Serializable {
	
	private static final long serialversionUID = 1L;
	
	//atributos da classe
	private Integer parCodigo;
	private Situacao situacao;
	private String parecer;
	private Date cadastradoEm;
	private Date alteradoEm;
	private Integer cadastradoPor;
	private Integer alteradoPor;	
	
	public Parecer() {
		
	}

	//get and set
	public Integer getParCodigo() {
		return parCodigo;
	}

	public void setParCodigo(Integer parCodigo) {
		this.parCodigo = parCodigo;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public String getParecer() {
		return parecer;
	}

	public void setParecer(String parecer) {
		this.parecer = parecer;
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
}
