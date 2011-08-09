package br.gov.pmdf.sicii.domain.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Classe Agencia
 * OBJETIVO: Representa as Agência do Sistema
 * AUTORES: Rogério & Vitor
 */

@Entity
public class Agencia extends BaseEntity implements Serializable {
	
	private static final long serialversionUID = 1L;
	
	//atributos da classe
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long ageCodigo;
	
	private Organizacao organizacao;
	private Integer tipo;
	private String status;
	private Date cadastradoEm;
	private Date alteradoEm;
	private Integer cadastradoPor;
	private Integer alteradoPor;
	
	@OneToMany
	private List<Assessoria> assessorias;
	
	public Agencia() {
		// TODO Auto-generated constructor stub
	}

	//get and set da classe
	public Long getAgeCodigo() {
		return ageCodigo;
	}
	public void setAgeCodigo(Long ageCodigo) {
		this.ageCodigo = ageCodigo;
	}
	public Organizacao getOrganizacao() {
		return organizacao;
	}
	public void setOrganizacao(Organizacao organizacao) {
		this.organizacao = organizacao;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
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

	public List<Assessoria> getAssessorias() {
		return assessorias;
	}

	public void setAssessorias(List<Assessoria> assessorias) {
		this.assessorias = assessorias;
	}
}
