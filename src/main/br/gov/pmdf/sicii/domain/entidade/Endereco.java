package br.gov.pmdf.sicii.domain.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.jboss.seam.annotations.Name;

@Entity
@SequenceGenerator(name="enderecoSequence", sequenceName="enderecoSequencePostgres" )
@Name("endereco")
public class Endereco extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="enderecoSequence")
	private Long id;
	
	private String logradouro;
	private String bairro;
	private String cidade;
	private String cidadeUF;
	
	
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
	public Long getId() {
		return id;
	}
}
