package br.gov.pmdf.sicii.domain.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

/**
 * Classe Investigado
 * OBJETIVO: Representar os investigados, alvo das invetigacoes
 * AUTORES: Rogerio & Vitor
 */

@Entity
public class Investigado extends BaseEntity implements Serializable {
	
	private static final long serialversionUID = 1L;
	
	private Integer invCodigo;
	private Integer cpf;
	private String nome;
	private Date nascimento;
	private String pai;
	private String mae;
	private String rua;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String cidadeUF;
	private Integer telefone;
	private Integer celular;
	private Date cadastradoEm;
	private Date alteradoEm;
	private Integer cadastradoPor;
	private Integer alteradoPor;
	
	private List<Investigacao> investigacoes;
	
	//m�todo construtor
	public Investigado() {
		
	}
	
	
	//get and set da classe
	public Integer getInvCodigo() {
		return invCodigo;
	}
	public void setInvCodigo(Integer invCodigo) {
		this.invCodigo = invCodigo;
	}
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getPai() {
		return pai;
	}
	public void setPai(String pai) {
		this.pai = pai;
	}
	public String getMae() {
		return mae;
	}
	public void setMae(String mae) {
		this.mae = mae;
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
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public Integer getCelular() {
		return celular;
	}
	public void setCelular(Integer celular) {
		this.celular = celular;
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


	public List<Investigacao> getInvestigacoes() {
		return investigacoes;
	}


	public void setInvestigacoes(List<Investigacao> investigacoes) {
		this.investigacoes = investigacoes;
	}
}
