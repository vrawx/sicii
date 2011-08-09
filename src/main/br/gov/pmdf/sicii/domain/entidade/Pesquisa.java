package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe Pesquisa
 * OBJETIVO: Representar as Pesquisas que compoem as Investigacoes dos Eventos 
 * de Investigacao
 * AUTORES: Rogerio & Vitor
 */

@Entity
public class Pesquisa extends BaseEntity {
			
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer pesCodigo;
	
	private Situacao situacao;
	private Organizacao organizacao;
	private TipoPesquisa tipoPesquisa;
	private Investigacao investigacao;
	private Date resposta;
	private String rua;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String cidadeUF;
	private String dadosAdicionais;
	private Date cadastradoEm;
	private Date alteradoEm;
	private Integer cadastradoPor;
	private Integer alteradoPor;
	
	private List<Embasamento> embasamentos;
	
	public Pesquisa() {

	}

	//get and set
	public Integer getPesCodigo() {
		return pesCodigo;
	}

	public void setPesCodigo(Integer pesCodigo) {
		this.pesCodigo = pesCodigo;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public Organizacao getOrganizacao() {
		return organizacao;
	}

	public void setOrganizacao(Organizacao organizacao) {
		this.organizacao = organizacao;
	}

	public TipoPesquisa getTipoPesquisa() {
		return tipoPesquisa;
	}

	public void setTipoPesquisa(TipoPesquisa tipoPesquisa) {
		this.tipoPesquisa = tipoPesquisa;
	}

	public Investigacao getInvestigacao() {
		return investigacao;
	}

	public void setInvestigacao(Investigacao investigacao) {
		this.investigacao = investigacao;
	}

	public Date getResposta() {
		return resposta;
	}

	public void setResposta(Date resposta) {
		this.resposta = resposta;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCidadeUF() {
		return cidadeUF;
	}

	public void setCidadeUF(String cidadeUF) {
		this.cidadeUF = cidadeUF;
	}

	public String getDadosAdicionais() {
		return dadosAdicionais;
	}

	public void setDadosAdicionais(String dadosAdicionais) {
		this.dadosAdicionais = dadosAdicionais;
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

	public List<Embasamento> getEmbasamentos() {
		return embasamentos;
	}

	public void setEmbasamentos(List<Embasamento> embasamentos) {
		this.embasamentos = embasamentos;
	}
}
