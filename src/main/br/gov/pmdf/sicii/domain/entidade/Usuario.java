package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;
import java.util.List;

/**
 * Classe Usuario
 * OBJETIVO: Representa os usuarios do Sistema
 * AUTORES: Rogerio & Vitor
 */

public class Usuario extends BaseEntity {
	
	private static final long serialversionUID = 1L;
	
	//atributos do sistema
	private Integer usuCodigo;
	private TipoUsuario tipoUsuario;
	private String login;
	private String senha;
	private Date cadastradoEm;
	private Date alteradoEm;
	private Integer cadastradoPor;
	private Integer alteradoPor;	
	
	private List<Assessoria> assessorias;
	
	public Usuario() {

	}

	//get and set
	public Integer getUsuCodigo() {
		return usuCodigo;
	}

	public void setUsuCodigo(Integer usuCodigo) {
		this.usuCodigo = usuCodigo;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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
