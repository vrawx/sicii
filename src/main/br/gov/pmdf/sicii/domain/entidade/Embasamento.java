/**
 * Classe Embasamento
 * OBJETIVO: Representar os Embasamentos das Pesquisas realizadas pelos Agentes
 * AUTORES: Rogério & Vitor
 */

package br.gov.sicii.domain;

import java.util.Date;
import java.util.List;

public class Embasamento extends BaseEntity {
	
	private static final long serialversionUID = 1L;
	
	//atributos da classe
	private Integer embCodigo;
	private TipoEmbasamento tipoEmbasamento;
	private Date adicionado;
	private String link;
	private String descricao;
	private Date cadastradoEm;
	private Date alteradoEm;
	private Integer cadastradoPor;
	private Integer alteradoPor;

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
