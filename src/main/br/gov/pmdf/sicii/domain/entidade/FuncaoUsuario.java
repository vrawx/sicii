package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	
	@OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE} )
	@JoinColumn(name="cadastradoPor")
	private Usuario cadastradoPor;
	private Date cadastradoEm;
	
	@OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE} )
	@JoinColumn(name="alteradoPor")
	private Usuario alteradoPor;
	private Date alteradoEm;	
		
	
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
	public Usuario getAlteradoPor() {
		return alteradoPor;
	}
	public Usuario getCadastradoPor() {
		return cadastradoPor;
	}
}
