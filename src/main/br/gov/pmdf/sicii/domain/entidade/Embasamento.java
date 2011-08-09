package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Classe Embasamento
 * OBJETIVO: Representar os Embasamentos das Pesquisas realizadas pelos Agentes
 * AUTORES: Rogerio & Vitor
 */

@Entity
public class Embasamento extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//atributos da classe
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer embCodigo;
	
	private TipoEmbasamento tipoEmbasamento;
	private Date adicionado;
	private String link;
	private String descricao;
	private Date cadastradoEm;
	private Date alteradoEm;
	private Integer cadastradoPor;
	private Integer alteradoPor;
	
	@OneToMany
	private List<Pesquisa> pesquisas;	
	
	public Embasamento() {

	}

	//get and set
	public Integer getEmbCodigo() {
		return embCodigo;
	}

	public void setEmbCodigo(Integer embCodigo) {
		this.embCodigo = embCodigo;
	}

	public TipoEmbasamento getTipoEmbasamento() {
		return tipoEmbasamento;
	}

	public void setTipoEmbasamento(TipoEmbasamento tipoEmbasamento) {
		this.tipoEmbasamento = tipoEmbasamento;
	}

	public Date getAdicionado() {
		return adicionado;
	}

	public void setAdicionado(Date adicionado) {
		this.adicionado = adicionado;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
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
