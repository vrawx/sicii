package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Role;

/**
 * Classe Investigado
 * OBJETIVO: Representar os investigados, alvo das invetigacoes
 * AUTORES: Rogerio & Vitor
 * Obs: A LISTA DE INVESTIGACOES FOI RETIRADA DESTA CLASSE PARA NAO GERAR UMA NOVA TABELA
 * 	E UM CONFLITO DE SEGURANCA DA INFORMACAO, JÁ QUE O INVESTIGADO FICARÁ DISPONIVEL PARA OUTROS
 *  PERFIS VIZUALIZAREM SEU ESTADO, NAO SENDO INTERESSANTE DEIXAR INFORMACOES DE INVESTIGACOES
 *  DISPONIVEIS.
 * 
 */

@Entity
@SequenceGenerator(name="investigadoSequence", sequenceName="investigadoSequencePostgres" )
@Name("investigado")
@Role(name="usuarioLogado", scope=ScopeType.SESSION)
public class Investigado extends BaseEntity {
			
	private static final long serialVersionUID = 1L;

	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO, generator="investigadoSequence")
	@Column(name="invCodigo")
	private Long codigoInvestigado;
	
	//@NotNull
	//@Length(min=8, max=12)	
	private String cpf;
	
	//@NotNull	
	private String nome;	
	private Date nascimento;
	private String nomeDoPai;
	private String nomeDaMae;
	private String sexo;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String cidadeUF;
	
	//@Length(max=8)
	private Integer numeroTelefone;
	//@Length(max=8)
	private Integer numeroCelular;

	// Este objeto não tem SET, pois o registro é feito somente uma vez
	@OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE} )
	@JoinColumn(name="cadastradoPor")
	private Usuario cadastradoPor;
	private Date cadastradoEm;
	
	@OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE} )
	@JoinColumn(name="alteradoPor")
	private Usuario alteradoPor;
	private Date alteradoEm;
	
	private Boolean excluido;
	
	//metodo construtor
	public Investigado() {
		
	}
	
	
	//get and set da classe
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	public Boolean getExcluido() {
		return excluido;
	}
	public void setExcluido(Boolean excluido) {
		this.excluido = excluido;
	}
	public Long getCodigoInvestigado() {
		return codigoInvestigado;
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
	public String getNomeDoPai() {
		return nomeDoPai;
	}
	public void setNomeDoPai(String nomeDoPai) {
		this.nomeDoPai = nomeDoPai;
	}
	public String getNomeDaMae() {
		return nomeDaMae;
	}
	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setCodigoInvestigado(Long codigoInvestigado) {
		this.codigoInvestigado = codigoInvestigado;
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
	public Integer getNumeroCelular() {
		return numeroCelular;
	}
	public void setNumeroCelular(Integer numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
	public Integer getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroTelefone(Integer numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
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
	public Usuario getCadastradoPor() {
		return cadastradoPor;
	}
	public Usuario getAlteradoPor() {
		return alteradoPor;
	}
	public void setAlteradoPor(Usuario alteradoPor) {
		this.alteradoPor = alteradoPor;
	}
	public void setCadastradoPor(Usuario cadastradoPor) {
		this.cadastradoPor = cadastradoPor;
	}
}
