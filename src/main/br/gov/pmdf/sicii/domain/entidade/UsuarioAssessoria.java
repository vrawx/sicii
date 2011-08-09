package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Classe UsuarioAssessoria
 * OBJETIVO: Representa a integracao entre os usuarios e as Assessorias do Sistema
 * AUTORES: Rogerio & Vitor
 */

@Entity
public class UsuarioAssessoria extends BaseEntity {
		
	private static final long serialVersionUID = 1L;

	//atributos da classe
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long uasCodigo;
	
	private FuncaoUsuario funcaoUsuario;
	private Usuario usuario;
	private Assessoria assessoria;
	private Boolean status;
	private Date cadastradoEm;
	private Date alteradoEm;
	private Integer cadastradoPor;
	private Integer alteradoPor;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Pesquisa> pesquisas;
	
	public UsuarioAssessoria() {
		// TODO Auto-generated constructor stub
	}

	//get and set
	public Long getUasCodigo() {
		return uasCodigo;
	}
	public void setUasCodigo(Long uasCodigo) {
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
