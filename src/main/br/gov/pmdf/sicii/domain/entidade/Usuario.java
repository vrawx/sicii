package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;
import org.jboss.seam.annotations.Name;

/**
 * Classe Usuario
 * OBJETIVO: Representa os usuarios do Sistema
 * AUTORES: Rogerio & Vitor
 */

@Entity
@SequenceGenerator(name="usuarioSequence", initialValue=0, sequenceName="usuarioSequencePostgres" )
@Table(name="USUARIO")
@Name("usuario")
public class Usuario extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//atributos do sistema
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO, generator="usuarioSequence")
	@Column(name="usuCodigo", nullable=false)
	private Long codigoUsuario;		
		
	@NotNull
	@Length(min=6, max=10)
	private String login;
	
	@NotNull
	@Length(min=6, max=10)
	private String senha;
	
	private Date cadastradoEm;
	private Date alteradoEm;
	private Integer cadastradoPor;
	private Integer alteradoPor;
	
	private Boolean statusLogin = false;
	
	// ESSE MÉTODO DEVE SER SAVE_UPDATE 
	@ManyToOne(fetch=FetchType.EAGER, cascade={CascadeType.REFRESH ,CascadeType.PERSIST})       
	@JoinColumn(name="tipoUsuario")
	private TipoUsuario tipoUsuario;
	
	@OneToMany
	private List<Assessoria> assessorias;
	
	public Usuario() {

	}
	public Usuario(String username, String password){
		this.login = username;
		this.senha = password;
	}
	/**
	 *  Este método será usado para validar a tentativa de login
	 */
	@Override
	public boolean equals(Object obj) {
		Usuario usuario = null;
		if(obj instanceof Usuario) { 
			usuario = (Usuario) obj;			
			if(( usuario.login.equalsIgnoreCase(this.login)) && (usuario.senha.equalsIgnoreCase(this.senha)))
				return true;			
		}		
		return false;		
	}
	
	public void setStatusLogin(Boolean statusLogin) {
		this.statusLogin = statusLogin;
	}
	public Boolean getStatusLogin() {
		return statusLogin;
	}
	
	//get and set
	public Long getCodigoUsuario() {
		return codigoUsuario;
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
