package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Classe EventoInvestigacao
 * OBJETIVO: Representa os Eventos de Investigacao que contem as Investigacoes sobre o Investigado
 * AUTORES: Rogerio & Vitor
 */

@Entity
public class EventoInvestigacao extends BaseEntity {
	
	
	private static final long serialVersionUID = 1L;
	
	//atributos da classe
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer eveCodigo;
	
	private Parecer parecer;
	private Situacao situacao;
	private Organizacao organizacao;
	private Integer numero;
	private Integer ano;
	private String descricao;
	private Date cadastradoEm;
	private Date alteradoEm;
	private Integer cadastradoPor;
	private Integer alteradoPor;	
	
	@OneToMany
	private List<Investigado> investigados;
	
	public EventoInvestigacao() {

	}

	//get and set da classe
	public Integer getEveCodigo() {
		return eveCodigo;
	}

	public void setEveCodigo(Integer eveCodigo) {
		this.eveCodigo = eveCodigo;
	}

	public Parecer getParecer() {
		return parecer;
	}

	public void setParecer(Parecer parecer) {
		this.parecer = parecer;
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

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Investigado> getInvestigados() {
		return investigados;
	}

	public void setInvestigados(List<Investigado> investigados) {
		this.investigados = investigados;
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
}
