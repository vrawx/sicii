package br.gov.pmdf.sicii.domain.entidade;

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
import javax.persistence.SequenceGenerator;

/**
 * Classe UsuarioAssessoria
 * OBJETIVO: Representa a integracao entre os usuarios e as Assessorias do Sistema
 * AUTORES: Rogerio & Vitor
 */

@Entity
@AssociationOverrides({ @AssociationOverride(name = "pk.usuario", joinColumns = @JoinColumn(name = "codigoUsuario")),		
						@AssociationOverride(name = "pk.assessoria", joinColumns = @JoinColumn(name = "codigoAssessoria")) })
@SequenceGenerator(name="usuarioAssessoriaSequence", sequenceName="usuarioAssessoriaPostgres")						
public class UsuarioAssessoria extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//atributos da classe
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="usuarioAssessoriaSequence")
	@Column(name="uasCodigo")
	private Long codigoUsuarioAssseoria;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false, cascade=CascadeType.ALL)	
	private Usuario usuario;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false, cascade=CascadeType.ALL)
	private Assessoria assessoria;
	
	@ManyToOne
	@JoinColumn
	private FuncaoUsuario funcaoUsuario;	
	private Boolean status;			
	
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
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}		
	public List<Pesquisa> getPesquisas() {
		return pesquisas;
	}
	public void setPesquisas(List<Pesquisa> pesquisas) {
		this.pesquisas = pesquisas;
	}
}
