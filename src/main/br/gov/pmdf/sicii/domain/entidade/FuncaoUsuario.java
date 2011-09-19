package br.gov.pmdf.sicii.domain.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.jboss.seam.annotations.Name;

/**
 * Classe FuncaoUsuario
 * OBJETIVO: Representa as Funcoes dos usuarios do Sistema
 * AUTORES: Rogerio & Vitor
 */

@Entity
@SequenceGenerator(name="funcaoSequence", initialValue=0, sequenceName="funcaoSequencePostgres" )
@Name("funcaoUsuario")
public class FuncaoUsuario extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//atributos da classe
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="funcaoSequence")
	@Column(name="funcodigo")
	private Long codigoFuncao;
	
	private String sigla;
	private String descricao;
			
	public FuncaoUsuario() {

	}

	//get and set da classe
	public Long getCodigoFuncao() {
		return codigoFuncao;
	}
	public void setCodigoFuncao(Long codigoFuncao) {
		this.codigoFuncao = codigoFuncao;
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
