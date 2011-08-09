package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe UsuarioAssessoriaPesquisa 
 * OBJETIVO: Representa pesquisa e parecer realizados por usuario de determinada Assessoria
 * AUTORES: Rogerio & Vitor
 */

@Entity
public class UsuarioAssessoriaPesquisa extends BaseEntity  {
	
	
	private static final long serialVersionUID = 1L;
	
	//atributos da Classe
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer upeCodigo;
	
	private UsuarioAssessoria usuarioAssessoria;
	private Pesquisa pesquisa;
	private Parecer parecer;
	private Date cadastradoEm;
	private Date alteradoEm;
	private Integer cadastradoPor;
	private Integer alteradoPor;
	
	public UsuarioAssessoriaPesquisa() {

	}

	//get and set da Classe
	public Integer getUpeCodigo() {
		return upeCodigo;
	}

	public void setUpeCodigo(Integer upeCodigo) {
		this.upeCodigo = upeCodigo;
	}

	public UsuarioAssessoria getUsuarioAssessoria() {
		return usuarioAssessoria;
	}

	public void setUsuarioAssessoria(UsuarioAssessoria usuarioAssessoria) {
		this.usuarioAssessoria = usuarioAssessoria;
	}

	public Pesquisa getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(Pesquisa pesquisa) {
		this.pesquisa = pesquisa;
	}

	public Parecer getParecer() {
		return parecer;
	}

	public void setParecer(Parecer parecer) {
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
