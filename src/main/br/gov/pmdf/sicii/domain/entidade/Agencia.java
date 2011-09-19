package br.gov.pmdf.sicii.domain.entidade;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.jboss.seam.annotations.Name;

/**
 * Classe Agencia
 * OBJETIVO: Representa as Agência do Sistema
 * AUTORES: Rogério & Vitor
 */

@Entity
@SequenceGenerator(name="agenciaSequence", sequenceName="agenciaSequencePostgres")
@Name("agencia")
public class Agencia extends BaseEntity {
		
	private static final long serialVersionUID = 1L;
	
	//atributos da classe
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="agenciaSequence")
	@Column(name="ageCodigo")
	private Long codigoAgencia;
	
	@OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
	private Organizacao organizacao;
	
	// Deve ser 0 - CENTRAL, 1 - LOCAL
	private Integer tipo;
	private Boolean status;	
			
		
	public Agencia() {}

	//get and set da classe	
	public Organizacao getOrganizacao() {
		return organizacao;
	}
	public void setOrganizacao(Organizacao organizacao) {
		this.organizacao = organizacao;
	}	
	public Long getCodigoAgencia() {
		return codigoAgencia;
	}
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}	
}
