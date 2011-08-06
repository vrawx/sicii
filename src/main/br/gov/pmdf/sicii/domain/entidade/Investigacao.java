/**
 * Classe Investigacao
 * OBJETIVO: Representa as Investigaï¿½ï¿½es do Investigado
 * AUTORES: Rogï¿½rio & Vitor
 */

package br.gov.sicii.domain;

import java.util.Date;
import java.util.List;

public class Investigacao extends BaseEntity {
	
	private static final long serialversionUID = 1L;
	
	//atributos da classe
	private Integer ivtCodigo;
	private Parecer parecer;
	private Situacao situacao;
	private EventoInvestigacao eventoInvestigacao;
	private Investigado investigado;
	private Date cadastradoEm;
	private Date alteradoEm;
	private Integer cadastradoPor;
	private Integer alteradoPor;
	
	private List<Investigado> investigados;
	private List<Pesquisa> pesquisas;
	
	//método Construtor
	public Investigacao() {
		
	}

	//get and set da classe
	public Integer getIvtCodigo() {
		return ivtCodigo;
	}

	public void setIvtCodigo(Integer ivtCodigo) {
		this.ivtCodigo = ivtCodigo;
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

	public EventoInvestigacao getEventoInvestigacao() {
		return eventoInvestigacao;
	}

	public void setEventoInvestigacao(EventoInvestigacao eventoInvestigacao) {
		this.eventoInvestigacao = eventoInvestigacao;
	}

	public Investigado getInvestigado() {
		return investigado;
	}

	public void setInvestigado(Investigado investigado) {
		this.investigado = investigado;
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

	public List<Investigado> getInvestigados() {
		return investigados;
	}

	public void setInvestigados(List<Investigado> investigados) {
		this.investigados = investigados;
	}

	public List<Pesquisa> getPesquisas() {
		return pesquisas;
	}

	public void setPesquisas(List<Pesquisa> pesquisas) {
		this.pesquisas = pesquisas;
	}
}
