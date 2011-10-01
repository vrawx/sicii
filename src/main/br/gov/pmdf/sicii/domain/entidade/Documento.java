package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import org.jboss.seam.annotations.Name;

/**
 * Classe Documento
 * OBJETIVO: Representa os Documentos criados para envio as Agencias do Sistema
 * AUTORES: Rogerio & Vitor
 */

@Entity
@SequenceGenerator(name="documentoSequence", sequenceName="documentoSequencePostgres")
@Name("documento")
public class Documento extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
		
	//atributos da classe
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="documentoSequence")
	@Column(name="docCodigo")
	private Long codigoDocumento;	
	
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
	
	
	@OneToMany
	private List<Assessoria> assessorias;
	
	@OneToMany(mappedBy="documento")	
	private List<Pesquisa> pesquisas;
	
	public Documento() {

	}
	//get and set da classe
	public Long getCodigoDocumento() {
		return codigoDocumento;
	}
	public void setCodigoDocumento(Long codigoDocumento) {
		this.codigoDocumento = codigoDocumento;
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
