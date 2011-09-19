package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import org.jboss.seam.annotations.Name;

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
			
	//@Length(max=8)
	private Integer numeroTelefone;
	//@Length(max=8)
	private Integer numeroCelular;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn
	private Endereco endereco;
	
	private Boolean excluido;
		
	//get and set da classe
	public Endereco getEndereco() {
		if (endereco == null) {
			endereco = new Endereco();			
		}		
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
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
}
