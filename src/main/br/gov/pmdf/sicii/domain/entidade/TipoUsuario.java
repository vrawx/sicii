package br.gov.pmdf.sicii.domain.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.jboss.seam.annotations.Name;

/**
 * Classe TipoUsuario
 * OBJETIVO: Representa os tipos de usuarios do Sistema
 * AUTORES: Rogerio & Vitor
 */

@Entity
@SequenceGenerator(name="tipoUsuarioSequence", initialValue=0, sequenceName="tipoUsuarioSequencePostgres" )
@Name("tipoUsuario")
public class TipoUsuario extends BaseEntity {

	private static final long serialVersionUID = 1L;

	//atributos do sistema
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="tipoUsuarioSequence")	
	private Long tipCodigo;
	
	private String sigla;
	private String descricao;	
	
	//get and set
	public Long getTipCodigo() {
		return tipCodigo;
	}
	public void setTipCodigo(Long tipCodigo) {
		this.tipCodigo = tipCodigo;
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
}
