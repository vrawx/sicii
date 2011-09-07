package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
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
import javax.persistence.OneToOne;

/**
 * Classe UsuarioAssessoria
 * OBJETIVO: Representa a integracao entre os usuarios e as Assessorias do Sistema
 * AUTORES: Rogerio & Vitor
 */

@Entity

@AssociationOverrides({ @AssociationOverride(name = "pk.usuario", joinColumns = @JoinColumn(name = "codigoUsuario")),		
						@AssociationOverride(name = "pk.assessoria", joinColumns = @JoinColumn(name = "codigoAssessoria")) })
public class UsuarioAssessoria extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//atributos da classe
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="uasCodigo")
	private Long codigoUsuarioAssseoria;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	private Usuario usuario;
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	private Assessoria assessoria;
	
	private FuncaoUsuario funcaoUsuario;	
	private Boolean status;
	
	@OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE} )
	@JoinColumn(name="cadastradoPor")
	private Usuario cadastradoPor;
	private Date cadastradoEm;
	
	@OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE} )
	@JoinColumn(name="alteradoPor")
	private Usuario alteradoPor;
	private Date alteradoEm;		
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Pesquisa> pesquisas;
	
	public UsuarioAssessoria() {
		// TODO Auto-generated constructor stub
	}

	//get and set
	public Long getCodigoUsuarioAssseoria() {
		return codigoUsuarioAssseoria;
	}
	public void setCodigoUsuarioAssseoria(Long codigoUsuarioAssseoria) {
		this.codigoUsuarioAssseoria = codigoUsuarioAssseoria;
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
	public Usuario getAlteradoPor() {
		return alteradoPor;
	}
	public void setAlteradoPor(Usuario alteradoPor) {
		this.alteradoPor = alteradoPor;
	}
	public Usuario getCadastradoPor() {
		return cadastradoPor;
	}
	public void setCadastradoPor(Usuario cadastradoPor) {
		this.cadastradoPor = cadastradoPor;
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
	public List<Pesquisa> getPesquisas() {
		return pesquisas;
	}
	public void setPesquisas(List<Pesquisa> pesquisas) {
		this.pesquisas = pesquisas;
	}
}
