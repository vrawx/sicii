package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;
import java.util.List;

/**
 * Classe Documento
 * OBJETIVO: Representa os Documentos criados para envio as Agencias do Sistema
 * AUTORES: Rogerio & Vitor
 */

public class Documento extends BaseEntity{
	
	private static final long serialversionUID = 1L;
	
	//atributos da classe
	private Integer docCodigo;
	private Organizacao organizacao;
	private TipoDocumento tipoDocumento;
	private Situacao situacao;
	private Integer numero;
	private Date data;
	private String referencia;
	private String difusaoAnterior;
	private String anexo;
	private Date validade;
	private String assunto;
	private String historico;
	private String necessidade;	
	private Date cadastradoEm;
	private Date alteradoEm;
	private Integer cadastradoPor;
	private Integer alteradoPor;

	private List<Assessoria> assessorias;
	private List<Pesquisa> pesquisas;
	
	public Documento() {

	}

	//get and set da classe
	public Integer getDocCodigo() {
		return docCodigo;
	}

	public void setDocCodigo(Integer docCodigo) {
		this.docCodigo = docCodigo;
	}

	public Organizacao getOrganizacao() {
		return organizacao;
	}

	public void setOrganizacao(Organizacao organizacao) {
		this.organizacao = organizacao;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getDifusaoAnterior() {
		return difusaoAnterior;
	}

	public void setDifusaoAnterior(String difusaoAnterior) {
		this.difusaoAnterior = difusaoAnterior;
	}

	public String getAnexo() {
		return anexo;
	}

	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	public String getNecessidade() {
		return necessidade;
	}

	public void setNecessidade(String necessidade) {
		this.necessidade = necessidade;
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

	public List<Pesquisa> getPesquisas() {
		return pesquisas;
	}

	public void setPesquisas(List<Pesquisa> pesquisas) {
		this.pesquisas = pesquisas;
	}
}
