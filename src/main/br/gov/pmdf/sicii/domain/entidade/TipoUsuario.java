package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

/**
 * Classe TipoUsuario
 * OBJETIVO: Representa os tipos de usuarios do Sistema
 * AUTORES: Rogerio & Vitor
 */

@Entity
@SequenceGenerator(name="tipoUsuarioSequence", initialValue=0, sequenceName="tipoUsuarioSequencePostgres" )
@Table(name="TIPOUSUARIO")
public class TipoUsuario extends BaseEntity {

	private static final long serialVersionUID = 1L;

	//atributos do sistema
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="tipoUsuarioSequence")	
	private Long tipCodigo;
	
	private String sigla;
	private String descricao;
	
	private Date cadastradoEm;
	@ForeignKey(name="cadastradoForeiginKey")	
	private Usuario cadastradoPor;

	private Date alteradoEm;
	@ForeignKey(name="alteradoPor")
	private Usuario alteradoPor;
	
	public TipoUsuario() {

	}

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

	public Usuario getCadastradoPor() {
		return cadastradoPor;
	}
	public void setCadastradoPor(Usuario cadastradoPor) {
		this.cadastradoPor = cadastradoPor;
	}
	public Usuario getAlteradoPor() {
		return alteradoPor;
	}
	public void setAlteradoPor(Usuario alteradoPor) {
		this.alteradoPor = alteradoPor;
	}
}
