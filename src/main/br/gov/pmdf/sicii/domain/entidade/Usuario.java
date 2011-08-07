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
 * Classe Usuario
 * OBJETIVO: Representa os usuarios do Sistema
 * AUTORES: Rogerio & Vitor
 */

@Entity
public class Usuario extends BaseEntity implements Serializable {
	
	private static final long serialversionUID = 1L;
	
	//atributos do sistema
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	/** ESTE ATRIBUTO FOI SUBSTITUIDO POR ID
		private Integer usuCodigo;
	*/
	
	private TipoUsuario tipoUsuario;
	private String login;
	private String senha;
	private Date cadastradoEm;
	private Date alteradoEm;
	private Integer cadastradoPor;
	private Integer alteradoPor;	
	
	@OneToMany
	private List<Assessoria> assessorias;
	
	public Usuario() {

	}

	/**
	 *  Este método será usado para validar a tentativa de login
	 */
	@Override
	public boolean equals(Object obj) {
		Usuario usuario = null;
		if(obj instanceof Usuario) { 
			usuario = (Usuario) obj;
			if(( usuario.login == this.login ) && (usuario.senha == this.senha))
				return true;			
		}		
		return false;		
	}
	
	//get and set
	public Long getId() {
		return id;
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
}
