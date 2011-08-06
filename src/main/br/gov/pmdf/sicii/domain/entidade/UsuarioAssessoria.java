/**
 * Classe UsuarioAssessoria
 * OBJETIVO: Representa a integração entre os usuarios e as Assessorias do Sistema
 * AUTORES: Rogério & Vitor
 */

package br.gov.sicii.domain;

import java.util.Date;
import java.util.List;

public class UsuarioAssessoria extends BaseEntity {
	
	private static final long serialversionUID = 1L;
	
	//atributos da classe
	private Integer uasCodigo;
	private FuncaoUsuario funcaoUsuario;
	private Usuario usuario;
	private Assessoria assessoria;
	private Boolean status;
	private Date cadastradoEm;
	private Date alteradoEm;
	private Integer cadastradoPor;
	private Integer alteradoPor;
	
	private List<Pesquisa> pesquisas;
	
	public UsuarioAssessoria() {
		// TODO Auto-generated constructor stub
	}

	//get and set
	public Integer getUasCodigo() {
		return uasCodigo;
	}

	public void setUasCodigo(Integer uasCodigo) {
		this.uasCodigo = uasCodigo;
	}

	public FuncaoUsuario getFuncaoUsuario() {
		return funcaoUsuario;
	}

	public void setFuncaoUsuario(FuncaoUsuario funcaoUsuario) {
		this.funcaoUsuario = funcaoUsuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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

	public List<Pesquisa> getPesquisas() {
		return pesquisas;
	}

	public void setPesquisas(List<Pesquisa> pesquisas) {
		this.pesquisas = pesquisas;
	}
}
